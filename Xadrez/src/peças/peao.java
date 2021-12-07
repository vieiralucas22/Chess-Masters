package peças;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;



public class peao {

	torre t= new torre();
	rainha q= new rainha();
	bispo b= new bispo();
	cavalo c= new cavalo();
	ImageIcon Pb = new ImageIcon(this.getClass().getResource("/peao-branco.png"));
	ImageIcon Pw = new ImageIcon(this.getClass().getResource("/Pb.png"));
	
	public ImageIcon peao_branco()
	{
		return Pb;
	}
	public ImageIcon peao_preto()
	{
		return Pw;
	}
	public void seleciona_borda(int matriz[][],JButton botao[][], int x, int y)
	{
		if(matriz[x][y]==1) {
			if(y+1<8) {
			if(matriz[x][y+1]==0) { 
				botao[x][y+1].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
				if(y+2<8) {
					if(matriz[x][y+2]==0)
						botao[x][y+2].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
				}
			}
			}
			if(y+1<8&&x+1<8) {
				if(matriz[x+1][y+1]<0)
					botao[x+1][y+1].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
			}
			if(y+1<8&&x-1>=0) {
				if(matriz[x-1][y+1]<0)
					botao[x-1][y+1].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
			}
			
		}
		if(matriz[x][y]==-1) {
			if(y-1>=0) {
			if(matriz[x][y-1]==0) { 
				botao[x][y-1].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
				if(y-2>=0) {
				if(matriz[x][y-2]==0&&y-2>=0)
					botao[x][y-2].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
				}
			}
				if(y-1>=0&&x-1>=0) {
					if(matriz[x-1][y-1]>0)
						botao[x-1][y-1].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
				}
				if(y-1>=0&&x+1<8) {
					if(matriz[x+1][y-1]>0)
						botao[x+1][y-1].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
				}
			
			}
			
		}
		
	}
	
	public void troca_pecas(int matriz[][],JButton botao[][],int move_x,int move_y,int x,int y,int cor)
	{
		matriz[move_x][move_y]=0;
		matriz[x][y]=cor;
		if(cor==1)
		botao[x][y].setIcon(peao_branco());
		if(cor==-1)
			botao[x][y].setIcon(peao_preto());
		botao[move_x][move_y].setIcon(null);
		botao[move_x][move_y].setBorder(javax.swing.BorderFactory.createLineBorder(null));
	}
	
	public void mata(int matriz[][], int move_x, int move_y, JButton botao[][], int x, int y) {
		int cor;
		if(matriz[move_x][move_y]==1) {
			cor=1;
			if(move_x+1<8&&move_y+1<8) {
				if(matriz[move_x+1][move_y+1]<0 && move_x+1==x && move_y+1==y) {
					troca_pecas(matriz,botao, move_x,move_y, x,y,cor);
					tranforma(matriz, x, y, botao, move_x, move_y);
					if(verifica_check(matriz,x,y))
						JOptionPane.showMessageDialog(null,"CHECKMATE");
				}
			}
			if(move_x-1>=0&&move_y+1<8) {
				if(matriz[move_x-1][move_y+1]<0 && move_x-1==x && move_y+1==y) {
					troca_pecas(matriz,botao, move_x,move_y, x,y,cor);
					tranforma(matriz, x, y, botao, move_x, move_y);
					if(verifica_check(matriz,x,y))
						JOptionPane.showMessageDialog(null,"CHECKMATE");
				}
			}
		}
		if(matriz[move_x][move_y]==-1) {
			cor=-1;
			if(move_x+1<8&&move_y-1>=0) {
				if(matriz[move_x+1][move_y-1]>0 && move_x+1==x && move_y-1==y) {
					troca_pecas(matriz,botao, move_x,move_y, x,y,cor);
					tranforma(matriz, x, y, botao, move_x, move_y);
					if(verifica_check(matriz,x,y))
						JOptionPane.showMessageDialog(null,"CHECKMATE");
				}
			}
			if(move_x-1>=0&&move_y-1>=0) {
				if(matriz[move_x-1][move_y-1]>0 && move_x-1==x && move_y-1==y) {
					troca_pecas(matriz,botao, move_x,move_y, x,y,cor);
					tranforma(matriz, x, y, botao, move_x, move_y);
					if(verifica_check(matriz,x,y))
						JOptionPane.showMessageDialog(null,"CHECKMATE");
				}
			}
		}
	}
	
	public void move(int matriz[][], int x, int y, JButton botao[][], int move_x, int move_y, int valor, int moveu) {
		
		
		if(matriz[move_x][move_y]==1) {
			
				if(matriz[move_x][move_y+1]==0) {
					if(matriz[x][y]==0) {
						matriz[x][y]=1;
						matriz[move_x][move_y]=0;
						botao[x][y].setIcon(peao_branco());
						botao[move_x][move_y].setIcon(null);
						botao[move_x][move_y].setBorder(javax.swing.BorderFactory.createLineBorder(null));
						
						
						if(verifica_check(matriz,x,y))
							JOptionPane.showMessageDialog(null,"CHECKMATE");
						}
					else 
						valor=0;
				}
				else {

					botao[move_x][move_y].setBorder(javax.swing.BorderFactory.createLineBorder(null));
					valor=0;
				}
		}
		
		
		if(matriz[move_x][move_y]==-1) {
			if(matriz[move_x][move_y-1]==0) {
				if(matriz[x][y]==0) {
					matriz[x][y]=-1;
					matriz[move_x][move_y]=0;
					botao[x][y].setIcon(peao_preto());
					botao[move_x][move_y].setIcon(null);
					botao[move_x][move_y].setBorder(javax.swing.BorderFactory.createLineBorder(null));
					if(verifica_check(matriz,x,y))
						JOptionPane.showMessageDialog(null,"CHECKMATE");
					}
				else 
					valor=0;
			}
			else {
				botao[move_x][move_y].setBorder(javax.swing.BorderFactory.createLineBorder(null));
				valor=0;
			}
		}
	}
	
	public void tranforma(int matriz[][], int x, int y, JButton botao[][], int move_x, int move_y)
	{
		
		Object[] options1 = {"Queen","Rook", "Bishop", "Horse"
					};
		if(matriz[x][y]==1) {
			for(int z=0;z<8;z++) {
				if(matriz[x][y]== matriz[z][7])
				{	
						     int empate = JOptionPane.showOptionDialog(null,
				             "Choose your new piece","",
				             JOptionPane.YES_NO_CANCEL_OPTION,
				             JOptionPane.PLAIN_MESSAGE,
				             null,
				             options1,
				             null);
							 switch(empate) {
								 			
						case 0:
							 matriz[x][y]=5;
							 botao[x][y].setIcon(q.rainha_branco());
							 break;
						case 1:
							 matriz[x][y]=2;
							 botao[x][y].setIcon(t.torre_branco());
							 break;
						case 2:
							 matriz[x][y]=4;
							 botao[x][y].setIcon(b.bispo_branco());
							 break;
						case 3:
							 matriz[x][y]=3;
							 botao[x][y].setIcon(c.cavalo_branco());
							 break;
						}
				}
			}	
		}
		if(matriz[x][y]==-1) {
			for(int z=0;z<8;z++) {
				if(matriz[x][y]== matriz[z][0])
				{
					 int empate = JOptionPane.showOptionDialog(null,
				             "Choose your new piece","",
				             JOptionPane.YES_NO_CANCEL_OPTION,
				             JOptionPane.PLAIN_MESSAGE,
				             null,
				             options1,
				             null);
							 switch(empate) {
								 			
						case 0:
							 matriz[x][y]=-5;
							 botao[x][y].setIcon(q.rainha_preto());
							 break;
						case 1:
							 matriz[x][y]=-2;
							 botao[x][y].setIcon(t.torre_preto());
							 break;
						case 2:
							 matriz[x][y]=-4;
							 botao[x][y].setIcon(b.bispo_preto());
							 break;
						case 3:
							 matriz[x][y]=-3;
							 botao[x][y].setIcon(c.cavalo_preto());
							 break;
						}
				}
			}	
		}
	}
	
	public boolean verifica_check(int matriz[][], int move_x, int move_y) {
		if(matriz[move_x][move_y]==1) {
			if((move_x-1>=0 && move_y+1<8) && (move_x+1<8 && move_y+1<8)) {
				if(matriz[move_x+1][move_y+1]==-6 || matriz[move_x-1][move_y+1]==-6) 
					return true;
			}
		}
		if(matriz[move_x][move_y]==-1) {
			if((move_x-1>=0 && move_y-1>=0) && (move_x+1<8 && move_y-1>=0)) {
			if(matriz[move_x-1][move_y-1]==6 || matriz[move_x+1][move_y-1]==6) 
				return true;
			}
		}
		return false;
	}
}
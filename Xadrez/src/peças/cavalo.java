package peças;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class cavalo {
	
	ImageIcon Cb = new ImageIcon(this.getClass().getResource("/C-branco.png"));
	ImageIcon Cp = new ImageIcon(this.getClass().getResource("/C-preto.png"));
	
	
	public ImageIcon cavalo_branco()
	{
		return Cb;
	}
	public ImageIcon cavalo_preto()
	{
		return Cp;
	}
	
	public void seleciona_borda(int matriz[][],JButton botao[][], int x, int y) {
	
		if(matriz[x][y]==3) {
			
			if(x+1<8&&y+2<8) {
				if(matriz[x+1][y+2]<=0)
					botao[x+1][y+2].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
			}
			if(x-1>=0&&y+2<8) {
				if(matriz[x-1][y+2]<=0)
					botao[x-1][y+2].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
			}
			if(x-2>=0&&y+1<8) {
				if(matriz[x-2][y+1]<=0)
					botao[x-2][y+1].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
			}
			if(x-2>=0&&y-1>=0) {
				if(matriz[x-2][y-1]<=0)
					botao[x-2][y-1].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
			}
			if(x-1>=0&&y-2>=0) {
				if(matriz[x-1][y-2]<=0)
					botao[x-1][y-2].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
			}
			if(x+1<8&&y-2>=0) {
				if(matriz[x+1][y-2]<=0)
					botao[x+1][y-2].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
			}
			if(x+2<8&&y-1>=0) {
				if(matriz[x+2][y-1]<=0)
					botao[x+2][y-1].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
			}
			if(x+2<8&&y+1<8) {
				if(matriz[x+2][y+1]<=0)
					botao[x+2][y+1].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
			}
		}
		else {
			if(x+1<8&&y+2<8) {
				if(matriz[x+1][y+2]>=0)
					botao[x+1][y+2].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
			}
			if(x-1>=0&&y+2<8) {
				if(matriz[x-1][y+2]>=0)
					botao[x-1][y+2].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
			}
			if(x-2>=0&&y+1<8) {
				if(matriz[x-2][y+1]>=0)
					botao[x-2][y+1].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
			}
			if(x-2>=0&&y-1>=0) {
				if(matriz[x-2][y-1]>=0)
					botao[x-2][y-1].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
			}
			if(x-1>=0&&y-2>=0) {
				if(matriz[x-1][y-2]>=0)
					botao[x-1][y-2].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
			}
			if(x+1<8&&y-2>=0) {
				if(matriz[x+1][y-2]>=0)
					botao[x+1][y-2].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
			}
			if(x+2<8&&y-1>=0) {
				if(matriz[x+2][y-1]>=0)
					botao[x+2][y-1].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
			}
			if(x+2<8&&y+1<8) {
				if(matriz[x+2][y+1]>=0)
					botao[x+2][y+1].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
			}
		}
	}
	
	public void troca_pecas(int matriz[][],JButton botao[][],int move_x,int move_y,int x,int y,int cor)
	{
		matriz[move_x][move_y]=0;
		matriz[x][y]=cor;
		if(cor==3)
		botao[x][y].setIcon(cavalo_branco());
		if(cor==-3)
			botao[x][y].setIcon(cavalo_preto());
		botao[move_x][move_y].setIcon(null);
		botao[move_x][move_y].setBorder(javax.swing.BorderFactory.createLineBorder(null));
	}
	
	public boolean verifica_mov(int matriz[][], int x, int y,int move_y,int move_x) {
		if(x==move_x+1&&y==move_y+2)
			return true;
		if(x==move_x-1&&y==move_y+2)
			return true;
		if(x==move_x-2&&y==move_y+1)
			return true;
		if(x==move_x-2&&y==move_y-1)
			return true;
		if(x==move_x-1&&y==move_y-2)
			return true;
		if(x==move_x+1&&y==move_y-2)
			return true;
		if(x==move_x+2&&y==move_y-1)
			return true;
		if(x==move_x+2&&y==move_y+1)
			return true;
		return false;
	}
	
	public boolean verifica_mata(int matriz[][], int x, int y,int move_y,int move_x) {
		if(matriz[move_x][move_y]==3) {
			if(matriz[x][y]<0) {
				if(x==move_x+1&&y==move_y+2)
					return true;
				if(x==move_x-1&&y==move_y+2)
					return true;
				if(x==move_x-2&&y==move_y+1)
					return true;
				if(x==move_x-2&&y==move_y-1)
					return true;
				if(x==move_x-1&&y==move_y-2)
					return true;
				if(x==move_x+1&&y==move_y-2)
					return true;
				if(x==move_x+2&&y==move_y-1)
					return true;
				if(x==move_x+2&&y==move_y+1)
					return true;
			}
		}
		if(matriz[move_x][move_y]==-3) {
			if(matriz[x][y]>0) {
				if(x==move_x+1&&y==move_y+2)
					return true;
				if(x==move_x-1&&y==move_y+2)
					return true;
				if(x==move_x-2&&y==move_y+1)
					return true;
				if(x==move_x-2&&y==move_y-1)
					return true;
				if(x==move_x-1&&y==move_y-2)
					return true;
				if(x==move_x+1&&y==move_y-2)
					return true;
				if(x==move_x+2&&y==move_y-1)
					return true;
				if(x==move_x+2&&y==move_y+1)
					return true;
			}
		}
		return false;
	}
	public void move(int matriz[][], int x, int y, JButton botao[][], int move_x, int move_y, int valor)
	{
		int cor;
		if(matriz[move_x][move_y]==3) {
			cor=3;
			if(matriz[x][y]==0&& verifica_mov(matriz,x,y,move_y,move_x)) {
				troca_pecas(matriz,botao, move_x,move_y, x,y,cor);
				if(verifica_check(matriz,x,y))
					JOptionPane.showMessageDialog(null,"CHECKMATE");
				}
			else {
				botao[move_x][move_y].setBorder(javax.swing.BorderFactory.createLineBorder(null));
				valor=0;
			}
		}
		if(matriz[move_x][move_y]==-3) {
			cor=-3;
			if(matriz[x][y]==0&&verifica_mov(matriz,x,y,move_y,move_x)) {
				troca_pecas(matriz,botao, move_x,move_y, x,y,cor);
				if(verifica_check(matriz,x,y)) 
					JOptionPane.showMessageDialog(null,"CHECKMATE");
				}
			else 
			{
				botao[move_x][move_y].setBorder(javax.swing.BorderFactory.createLineBorder(null));
				valor=0;
			}
		}
	}
	
	public void matou(int x, int y, int move_y, int move_x,int matriz[][],JButton botao[][])
	{
		int cor;
		if(matriz[move_x][move_y]==3) {
			cor=3;
			if(verifica_mata(matriz, x, y,move_y, move_x)) {
				troca_pecas(matriz,botao, move_x,move_y, x,y,cor);
				
				if(verifica_check(matriz,x,y))
					JOptionPane.showMessageDialog(null,"CHECKMATE");
			}
		}
		if(matriz[move_x][move_y]==-3) {
			cor=-3;
			if(verifica_mata(matriz, x, y,move_y, move_x)) {
				troca_pecas(matriz,botao, move_x,move_y, x,y,cor);
				if(verifica_check(matriz,x,y))
					JOptionPane.showMessageDialog(null,"CHECKMATE");
			}
		}
	}
	
	public boolean verifica_check(int matriz[][], int x, int y) {
		if(matriz[x][y]==3) {
				if(x+1<8 && y+2<8) {
				if(matriz[x+1][y+2]==-6)
					return true;}
				
				if(x-1>=0 && y+2<8) {
				if( matriz[x-1][y+2]==-6)
					return true;
				}
				
				if(x-2>=0 && y+1<8) {
				if( matriz[x-2][y+1]==-6)
					return true;
				}
				
				if(x-2>=0 && y-1>=8) {
				if( matriz[x-2][y-1]==-6)
					return true;
				}
				
				if(x-1>=0 && y-2>=0) {
				if( matriz[x-1][y-2]==-6)
					return true; 
				}
				
				if(x+1<8 && y-2>=0) {
				if(matriz[x+1][y-2]==-6)
					return true;
				}
				
				if(x+2<8 && y-1>=0) {
				if(matriz[x+2][y-1]==-6)
					return true;
				}
				
				if(x+2<8 && y+1<8) {
				if(matriz[x+2][y+1]==-6)
					return true;
				}
			
		}
		if(matriz[x][y]==-3) {
			
			if(x+1<8 && y+2<8) {
				if(matriz[x+1][y+2]==6)
					return true;}
				
				if(x-1>=0 && y+2<8) {
				if( matriz[x-1][y+2]==6)
					return true;
				}
				
				if(x-2>=0 && y+1<8) {
				if( matriz[x-2][y+1]==6)
					return true;
				}
				
				if(x-2>=0 && y-1>=8) {
				if( matriz[x-2][y-1]==6)
					return true;
				}
				
				if(x-1>=0 && y-2>=0) {
				if( matriz[x-1][y-2]==6)
					return true;
				}
				
				if(x+1<8 && y-2>=0) {
				if(matriz[x+1][y-2]==6)
					return true;
				}
				
				if(x+2<8 && y-1>=0) {
				if(matriz[x+2][y-1]==6)
					return true;
				}
				
				if(x+2<8 && y+1<8) {
				if(matriz[x+2][y+1]==6)
					return true;
				}
			
		}
		return false;
	}
}

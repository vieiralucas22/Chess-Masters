package peças;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class rei {
	
	ImageIcon Rb = new ImageIcon(this.getClass().getResource("/rei-branco.png"));
	ImageIcon Rp = new ImageIcon(this.getClass().getResource("/rei-preto.png"));
	
	int posX;
	int posY;
	int valor=6;
	
	public ImageIcon rei_branco()
	{
		return Rb;
	}
	public ImageIcon rei_preto()
	{
		return Rp;
	}
	
	public void seleciona_borda(int matriz[][],JButton botao[][],int  x,int  y)
	{
		if(matriz[x][y]==6)
		{
			if(x+1<8)
			{
				if(matriz[x+1][y]<=0)
				{
					botao[x+1][y].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
				}
			}
			if(y+1<8)
			{
				if(matriz[x][y+1]<=0)
				{
					botao[x][y+1].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
				}
			}
			if(x-1>=0)
			{
				if(matriz[x-1][y]<=0)
				{
					botao[x-1][y].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
				}
			}
			
			if(y-1>=0)
			{
				if(matriz[x][y-1]<=0)
				{
					botao[x][y-1].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
				}
			}
			
			if(y-1>=0&&x-1>=0)
			{
				if(matriz[x-1][y-1]<=0)
				{
					botao[x-1][y-1].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
				}
			}
			
			if(y+1<8&&x-1>=0)
			{
				if(matriz[x-1][y+1]<=0)
				{
					botao[x-1][y+1].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
				}
			}
			
			if(y+1<8&&x+1<8)
			{
				if(matriz[x+1][y+1]<=0)
				{
					botao[x+1][y+1].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
				}
			}
			if(y-1>=0&&x+1<8)
			{
				if(matriz[x+1][y-1]<=0)
				{
					botao[x+1][y-1].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
				}
			}
		}else
		{
		
			if(x+1<8)
			{
				if(matriz[x+1][y]>=0)
				{
					botao[x+1][y].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
				}
			}
			if(y+1<8)
			{
				if(matriz[x][y+1]>=0)
				{
					botao[x][y+1].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
				}
			}
			if(x-1>=0)
			{
				if(matriz[x-1][y]>=0)
				{
					botao[x-1][y].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
				}
			}
			
			if(y-1>=0)
			{
				if(matriz[x][y-1]>=0)
				{
					botao[x][y-1].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
				}
			}
			
			if(y-1>=0&&x-1>=0)
			{
				if(matriz[x-1][y-1]>=0)
				{
					botao[x-1][y-1].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
				}
			}
			
			if(y+1<8&&x-1>=0)
			{
				if(matriz[x-1][y+1]>=0)
				{
					botao[x-1][y+1].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
				}
			}
			
			if(y+1<8&&x+1<8)
			{
				if(matriz[x+1][y+1]>=0)
				{
					botao[x+1][y+1].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
				}
			}
			if(y-1<8&&x+1<8)
			{
				if(matriz[x+1][y-1]>=0)
				{
					botao[x+1][y-1].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
				}
			}
			
		}
	}
	
	public void troca_pecas(int matriz[][],JButton botao[][],int move_x,int move_y,int x,int y,int cor)
	{
		matriz[move_x][move_y]=0;
		matriz[x][y]=cor;
		if(cor==6)
		botao[x][y].setIcon(rei_branco());
		if(cor==-6)
			botao[x][y].setIcon(rei_preto());
		botao[move_x][move_y].setIcon(null);
		botao[move_x][move_y].setBorder(javax.swing.BorderFactory.createLineBorder(null));
	}
	
	public boolean verifica_move(int matriz[][], int x, int y,int move_y,int move_x)
	{
		if(x==move_x+1)
			return true;
		if(x==move_x-1)
			return true;
		if(y==move_y+1)
			return true;
		if(y==move_y-1)
			return true;
		if(y==move_y-1 && x==move_x-1)
			return true;
		if(y==move_y-1 && x==move_x+1)
			return true;
		if(y==move_y+1 && x==move_x+1)
			return true;
		if(y==move_y+1 && x==move_x-1)
			return true;
		
		return false;
	}
	
	
	public void move(int matriz[][], int x, int y, JButton botao[][], int move_x, int move_y, int valor)
	{
		int cor;
		if(matriz[move_x][move_y]==6)
		{
			cor=6;
			if(matriz[x][y]==0 && verifica_move(matriz, x,y,move_y,move_x))
			{
				troca_pecas(matriz,botao, move_x,move_y, x,y,cor);
				if(verifica_check(matriz,x,y))
					JOptionPane.showMessageDialog(null,"CHECKMATE");
			}else {
				botao[move_x][move_y].setBorder(javax.swing.BorderFactory.createLineBorder(null));
				valor=0;
			}
			
		}
		if(matriz[move_x][move_y]==-6)
		{
			cor=-6;
			if(matriz[x][y]==0 && verifica_move(matriz, x,y,move_y,move_x))
			{
				troca_pecas(matriz,botao, move_x,move_y, x,y,cor);
				if(verifica_check(matriz,x,y))
					JOptionPane.showMessageDialog(null,"CHECKMATE");
			}else {
				botao[move_x][move_y].setBorder(javax.swing.BorderFactory.createLineBorder(null));
				valor=0;
			}
			
		}
	}
	
	public boolean verifica_mata(int matriz[][], int x, int y,int move_y,int move_x)
	{
		if(matriz[move_x][move_y]==6)
		{
			if(matriz[x][y]<0)
			{
				if(x==move_x+1)
					return true;
				if(x==move_x-1)
					return true;
				if(y==move_y+1)
					return true;
				if(y==move_y-1)
					return true;
				if(y==move_y-1 && x==move_x-1)
					return true;
				if(y==move_y-1 && x==move_x+1)
					return true;
				if(y==move_y+1 && x==move_x+1)
					return true;
				if(y==move_y+1 && x==move_x-1)
					return true;
			}
		}
		
		if(matriz[move_x][move_y]==-6)
		{
			if(matriz[x][y]>0)
			{
				if(x==move_x+1)
					return true;
				if(x==move_x-1)
					return true;
				if(y==move_y+1)
					return true;
				if(y==move_y-1)
					return true;
				if(y==move_y-1 && x==move_x-1)
					return true;
				if(y==move_y-1 && x==move_x+1)
					return true;
				if(y==move_y+1 && x==move_x+1)
					return true;
				if(y==move_y+1 && x==move_x-1)
					return true;
			}
		}
		return false;
	}
	
	public void mata(int x, int y, int move_y, int move_x,int matriz[][],JButton botao[][])
	{
		int cor;
		if(matriz[move_x][move_y]==6)
		{
			cor=6;
			if(verifica_mata(matriz,x,y,move_y,move_x))
			{
				troca_pecas(matriz,botao, move_x,move_y, x,y,cor);
				if(verifica_check(matriz,x,y))
					JOptionPane.showMessageDialog(null,"CHECKMATE");
			}
			
		}
		
		if(matriz[move_x][move_y]==-6)
		{
			cor=-6;
			if(verifica_mata(matriz,x,y,move_y,move_x))
			{
				troca_pecas(matriz,botao, move_x,move_y, x,y,cor);
				if(verifica_check(matriz,x,y))
					JOptionPane.showMessageDialog(null,"CHECKMATE");
			}
			
		}
	}
	public boolean verifica_check(int matriz[][], int x, int y) {
		if(matriz[x][y]==6)
		{
				if(matriz[x+1][y]==-6)
					return true;
				if(matriz[x-1][y]==-6)
					return true;
				if(matriz[x][y+1]==-6)
					return true;
				if(matriz[x][y-1]==-6)
					return true;
				if(matriz[x-1][y-1]==-6)
					return true;
				if(matriz[x+1][y-1]==-6)
					return true;
				if(matriz[x+1][y+1]==-6)
					return true;
				if(matriz[x-1][y+1]==-6)
					return true;
		}
		
		if(matriz[x][y]==-6)
		{
				if(matriz[x+1][y]==6)
					return true;
				if(matriz[x-1][y]==6)
					return true;
				if(matriz[x][y+1]==6)
					return true;
				if(matriz[x][y-1]==6)
					return true;
				if(matriz[x-1][y-1]==6)
					return true;
				if(matriz[x+1][y-1]==6)
					return true;
				if(matriz[x+1][y+1]==6)
					return true;
				if(matriz[x-1][y+1]==6)
					return true;
		}
		return false;
	}
}

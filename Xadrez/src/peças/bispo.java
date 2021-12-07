package peças;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class bispo {
	
	ImageIcon Bb = new ImageIcon(this.getClass().getResource("/B-branco.png"));
	ImageIcon Bp = new ImageIcon(this.getClass().getResource("/Bb.png"));
	rei r=new rei();
	public ImageIcon bispo_branco()
	{
		return Bb;
	}
	public ImageIcon bispo_preto()
	{
		return Bp;
	}
	
	public void seleciona_borda(int matriz[][],JButton botao[][], int x, int y)
	{
		if(matriz[x][y]==4)
		{
			for(int z=1;z<8;z++)
			{
				if(x+z<8 && y+z<8)
				{
					if(matriz[x+z][y+z]==0)
					{
						botao[x+z][y+z].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
					}
					if(matriz[x+z][y+z]<0)
					{
						botao[x+z][y+z].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
						break;
					}
					if(matriz[x+z][y+z]>0)
					{
						
						break;
					}
				}
			}
			for(int z=1;z<8;z++) {
				if(x+z<8 && y-z>=0)
				{
					if(matriz[x+z][y-z]==0)
					{
						botao[x+z][y-z].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
					}
					if(matriz[x+z][y-z]<0)
					{
						botao[x+z][y-z].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
						break;
					}
					if(matriz[x+z][y-z]>0)
					{
						break;
					}
				}}
			for(int z=1;z<8;z++) {
				if(x-z>=0 && y-z>=0)
				{
					if(matriz[x-z][y-z]==0)
					{
						botao[x-z][y-z].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
					}
					if(matriz[x-z][y-z]<0)
					{
						botao[x-z][y-z].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
						break;
					}
					if(matriz[x-z][y-z]>0)
					{
						break;
					}
				}}
			for(int z=1;z<8;z++) {
			
				if(x-z>=0 && y+z<8)
				{
				if(matriz[x-z][y+z]==0)
				{
					botao[x-z][y+z].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
				}
				if(matriz[x-z][y+z]<0)
				{
					botao[x-z][y+z].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
					break;
				}
				if(matriz[x-z][y+z]>0)
				{
					break;
				}
				}
			
			}
			
			
		}else {
			
			for(int z=1;z<8;z++)
			{
				if(x+z<8 && y+z<8)
				{
					if(matriz[x+z][y+z]==0)
					{
						botao[x+z][y+z].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
					}
					if(matriz[x+z][y+z]>0)
					{
						botao[x+z][y+z].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
						break;
					}
					if(matriz[x+z][y+z]<0)
					{
						botao[x+z][y+z].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
						break;
					}
				}
			}
			for(int z=1;z<8;z++) {
				if(x+z<8 && y-z>=0)
				{
					if(matriz[x+z][y-z]==0)
					{
						botao[x+z][y-z].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
					}
					if(matriz[x+z][y-z]>0)
					{
						botao[x+z][y-z].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
						break;
					}
					if(matriz[x+z][y-z]<0)
					{
						break;
					}
				}}
			for(int z=1;z<8;z++) {
				if(x-z>=0 && y-z>=0)
				{
					if(matriz[x-z][y-z]==0)
					{
						botao[x-z][y-z].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
					}
					if(matriz[x-z][y-z]>0)
					{
						botao[x-z][y-z].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
						break;
					}
					if(matriz[x-z][y-z]<0)
					{
						break;
					}
				}}
			for(int z=1;z<8;z++) {
			
				if(x-z>=0 && y+z<8)
				{
				if(matriz[x-z][y+z]==0)
				{
					botao[x-z][y+z].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
				}
				if(matriz[x-z][y+z]>0)
				{
					botao[x-z][y+z].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
					break;
				}
				if(matriz[x-z][y+z]<0)
				{
					break;
				}
				}
			
			}	
		
	}}
	
	public void troca_pecas(int matriz[][],JButton botao[][],int move_x,int move_y,int x,int y,int cor)
	{
		matriz[move_x][move_y]=0;
		matriz[x][y]=cor;
		if(cor==4)
		botao[x][y].setIcon(bispo_branco());
		if(cor==-4)
			botao[x][y].setIcon(bispo_preto());
		botao[move_x][move_y].setIcon(null);
		botao[move_x][move_y].setBorder(javax.swing.BorderFactory.createLineBorder(null));
	}
	
	public boolean verifica_mov(int matriz[][], int move_x, int move_y, int x, int y) {
	
		int flag_esq_baixo=0, flag_dir_baixo=0,flag_dir_cima=0,flag_esq_cima=0;
		int i, j;
			///4 quadrante
			i=move_x+1;
			j=move_y+1;
			while(i<8&&j<8) {
				if(matriz[i][j]!=0)
					flag_dir_baixo=1;
				if(flag_dir_baixo==0)
				{
					if(j==y && i==x)
						return true;
				}
				i++;
				j++;
			}
			//3 quadrante
			i=move_x-1;
			j=move_y+1;
			while(i>=0&&j<8) {
				if(matriz[i][j]!=0)
					flag_esq_baixo=1;
				if(flag_esq_baixo==0)
				{
					if(j==y && i==x)
						return true;
					//else flag_esq_baixo=1;
				}
				i--;
				j++;
			}
			//2 quadrante
			i=move_x-1;
			j=move_y-1;
			while(i>=0&&j>=0) {
				if(matriz[i][j]!=0)
					flag_esq_cima=1;
				if(flag_esq_cima==0)
				{
					if(j==y && i==x)
						return true;
					//else flag_esq_cima=1;
				}
				i--;
				j--;
			}
			//1 quadrante
			i=move_x+1;
			j=move_y-1;
			while(i<8&&j>=0) {
				if(matriz[i][j]!=0)
					flag_dir_cima=1;
				if(flag_dir_cima==0)
				{
					if(j==y && i==x)
						return true;
					//else flag_dir_cima=1;
				}
				i++;
				j--;
			}

		
		
		return false;
	}
	public void move(int matriz[][], int x, int y, JButton botao[][], int move_x, int move_y, int valor) {
		int cor;
		if(matriz[move_x][move_y]==4) {
			cor=4;
			if(matriz[x][y]==0&&verifica_mov(matriz,move_x,move_y,x,y)) {
				troca_pecas(matriz,botao, move_x,move_y, x,y,cor);
				if(verifica_check(matriz,x,y))
					JOptionPane.showMessageDialog(null,"CHECKMATE");
				
				}
			else {
				botao[move_x][move_y].setBorder(javax.swing.BorderFactory.createLineBorder(null));
				valor=0;
			}
		}
		if(matriz[move_x][move_y]==-4) {
			cor=-4;
			if(matriz[x][y]==0&&verifica_mov(matriz,move_x,move_y,x,y)) {
				troca_pecas(matriz,botao, move_x,move_y, x,y,cor);
				if(verifica_check(matriz,x,y))
					JOptionPane.showMessageDialog(null,"CHECKMATE");
				
				}
			else {
				botao[move_x][move_y].setBorder(javax.swing.BorderFactory.createLineBorder(null));
				valor=0;
			}
		}

	}
	
	public boolean verifica_mata(int matriz[][], int x, int y,int move_y,int move_x)
	{
		int flag_esq_baixo=0, flag_dir_baixo=0,flag_dir_cima=0,flag_esq_cima=0;
		int i, j;
		if(matriz[move_x][move_y]==4) {
			///4 quadrante
			i=move_x+1;
			j=move_y+1;
			while(i<8&&j<8) {
				if(matriz[i][j]>0)
					flag_dir_baixo=1;
				if(matriz[i][j]<0 && flag_dir_baixo==0)
				{
					if(j==y && i==x)
						return true;
					else flag_dir_baixo=1;
				}
				i++;
				j++;
			}
			//3 quadrante
			i=move_x-1;
			j=move_y+1;
			while(i>=0&&j<8) {
				if(matriz[i][j]>0)
					flag_esq_baixo=1;
				if(matriz[i][j]<0 && flag_esq_baixo==0)
				{
					if(j==y && i==x)
						return true;
					else flag_esq_baixo=1;
				}
				i--;
				j++;
			}
			//2 quadrante
			i=move_x-1;
			j=move_y-1;
			while(i>=0&&j>=0) {
				if(matriz[i][j]>0)
					flag_esq_cima=1;
				if(matriz[i][j]<0 && flag_esq_cima==0)
				{
					if(j==y && i==x)
						return true;
					else flag_esq_cima=1;
				}
				i--;
				j--;
			}
			//1 quadrante
			i=move_x+1;
			j=move_y-1;
			while(i<8&&j>=0) {
				if(matriz[i][j]>0)
					flag_dir_cima=1;
				if(matriz[i][j]<0 && flag_dir_cima==0)
				{
					if(j==y && i==x)
						return true;
					else flag_dir_cima=1;
				}
				i++;
				j--;
			}

		}
		if(matriz[move_x][move_y]==-4) {
			///4 quadrante
			i=move_x+1;
			j=move_y+1;
			while(i<8&&j<8) {
				if(matriz[i][j]<0)
					flag_dir_baixo=1;
				if(matriz[i][j]>0 && flag_dir_baixo==0)
				{
					if(j==y && i==x)
						return true;
					else flag_dir_baixo=1;
				}
				i++;
				j++;
			}
			//3 quadrante
			i=move_x-1;
			j=move_y+1;
			while(i>=0&&j<8) {
				if(matriz[i][j]<0)
					flag_esq_baixo=1;
				if(matriz[i][j]>0 && flag_esq_baixo==0)
				{
					if(j==y && i==x)
						return true;
					else flag_esq_baixo=1;
				}
				i--;
				j++;
			}
			//2 quadrante
			i=move_x-1;
			j=move_y-1;
			while(i>=0&&j>=0) {
				if(matriz[i][j]<0)
					flag_esq_cima=1;
				if(matriz[i][j]>0 && flag_esq_cima==0)
				{
					if(j==y && i==x)
						return true;
					else flag_esq_cima=1;
				}
				i--;
				j--;
			}
			//1 quadrante
			i=move_x+1;
			j=move_y-1;
			while(i<8&&j>=0) {
				if(matriz[i][j]<0)
					flag_dir_cima=1;
				if(matriz[i][j]>0 && flag_dir_cima==0)
				{
					if(j==y && i==x)
						return true;
					else flag_dir_cima=1;
				}
				i++;
				j--;
			}

		}
		return false;
	}
	
	public void mata(int x, int y, int move_y, int move_x,int matriz[][],JButton botao[][])
	{
		int cor;
		if(matriz[move_x][move_y]==4)
		{
			cor=4;
			if(verifica_mata(matriz,x,y,move_y,move_x))
			{
				troca_pecas(matriz,botao, move_x,move_y, x,y,cor);
				if(verifica_check(matriz,x,y))
					JOptionPane.showMessageDialog(null,"CHECKMATE");
			}
			
		}
		
		if(matriz[move_x][move_y]==-4)
		{
			cor=-4;
			if(verifica_mata(matriz,x,y,move_y,move_x))
			{
				troca_pecas(matriz,botao, move_x,move_y, x,y,cor);
				if(verifica_check(matriz,x,y))
					JOptionPane.showMessageDialog(null,"CHECKMATE");
			}
			
		}
	}
	
	public boolean verifica_check(int matriz[][], int x, int y) {
		int flag_esq_baixo=0, flag_dir_baixo=0,flag_dir_cima=0,flag_esq_cima=0;
		int i, j;
		if(matriz[x][y]==4) {
			///4 quadrante
			i=x+1;
			j=y+1;
			while(i<8&&j<8) {
				if(matriz[i][j]>0)
					flag_dir_baixo=1;
				if(matriz[i][j]<0 && flag_dir_baixo==0)
				{
					if(matriz[i][j]==-6)
						return true;
					else flag_dir_baixo=1;
				}
				i++;
				j++;
			}
			//3 quadrante
			i=x-1;
			j=y+1;
			while(i>=0&&j<8) {
				if(matriz[i][j]>0)
					flag_esq_baixo=1;
				if(matriz[i][j]<0 && flag_esq_baixo==0)
				{
					if(matriz[i][j]==-6)
						return true;
					else flag_esq_baixo=1;
				}
				i--;
				j++;
			}
			//2 quadrante
			i=x-1;
			j=y-1;
			while(i>=0&&j>=0) {
				if(matriz[i][j]>0)
					flag_esq_cima=1;
				if(matriz[i][j]<0 && flag_esq_cima==0)
				{
					if(matriz[i][j]==-6)
						return true;
					else flag_esq_cima=1;
				}
				i--;
				j--;
			}
			//1 quadrante
			i=x+1;
			j=y-1;
			while(i<8&&j>=0) {
				if(matriz[i][j]>0)
					flag_dir_cima=1;
				if(matriz[i][j]<0 && flag_dir_cima==0)
				{
					if(matriz[i][j]==-6)
						return true;
					else flag_dir_cima=1;
				}
				i++;
				j--;
			}

		}
		if(matriz[x][y]==-4) {
			///4 quadrante
			i=x+1;
			j=y+1;
			while(i<8&&j<8) {
				if(matriz[i][j]<0)
					flag_dir_baixo=1;
				if(matriz[i][j]>0 && flag_dir_baixo==0)
				{
					if(matriz[i][j]==6)
						return true;
					else flag_dir_baixo=1;
				}
				i++;
				j++;
			}
			//3 quadrante
			i=x-1;
			j=y+1;
			while(i>=0&&j<8) {
				if(matriz[i][j]<0)
					flag_esq_baixo=1;
				if(matriz[i][j]>0 && flag_esq_baixo==0)
				{
					if(matriz[i][j]==6)
						return true;
					else flag_esq_baixo=1;
				}
				i--;
				j++;
			}
			//2 quadrante
			i=x-1;
			j=y-1;
			while(i>=0&&j>=0) {
				if(matriz[i][j]<0)
					flag_esq_cima=1;
				if(matriz[i][j]>0 && flag_esq_cima==0)
				{
					if(matriz[i][j]==6)
						return true;
					else flag_esq_cima=1;
				}
				i--;
				j--;
			}
			//1 quadrante
			i=x+1;
			j=y-1;
			while(i<8&&j>=0) {
				if(matriz[i][j]<0)
					flag_dir_cima=1;
				if(matriz[i][j]>0 && flag_dir_cima==0)
				{
					if(matriz[i][j]==6)
						return true;
					else flag_dir_cima=1;
				}
				i++;
				j--;
			}

		}
		return false;
	}
}

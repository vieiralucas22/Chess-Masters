package peças;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class rainha {
	
	ImageIcon Qb = new ImageIcon(this.getClass().getResource("/qw.png"));
	ImageIcon Qp = new ImageIcon(this.getClass().getResource("/Qb.png"));


	public ImageIcon rainha_branco()
	{
		return Qb;
	}
	public ImageIcon rainha_preto()
	{
		return Qp;
	}
	
	public void seleciona_borda(int[][] matriz, JButton[][] botao, int x, int y) {
		
		if(matriz[x][y]==5)
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
			
				for(int z=1;z<8;z++)
				{
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
				}
				}
				
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
				////////////////////////////////////////////////////////
				for(int z=1;z<8;z++) {
				if(x+z<8)
				{
					if(matriz[x+z][y]==0)
					{
						botao[x+z][y].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
					}
					
					if(matriz[x+z][y]<0)
					{
						botao[x+z][y].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
						break;
					}
					if(matriz[x+z][y]>0)
					{
						break;
					}
				}}
				
				for(int z=1;z<8;z++) {
				if(x-z>=0)
				{
					if(matriz[x-z][y]==0)
					{
						botao[x-z][y].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
					}
					if(matriz[x-z][y]<0)
					{
						botao[x-z][y].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
						break;
					}
					if(matriz[x-z][y]>0)
					{
						break;
					}
				}}
				
				for(int z=1;z<8;z++) {
				if(y-z>=0)
				{
					if(matriz[x][y-z]==0)
					{
						botao[x][y-z].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
					}
					if(matriz[x][y-z]<0)
					{
						botao[x][y-z].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
						break;
					}
					if(matriz[x][y-z]>0)
					{
						break;
					}
					
				}}
				for(int z=1;z<8;z++) {
				if(y+z<8)
				{
					if(matriz[x][y+z]==0)
					{
						botao[x][y+z].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
					}
					if(matriz[x][y+z]<0)
					{
						botao[x][y+z].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
						break;
					}
					if(matriz[x][y+z]>0)
					{
						
						break;
					}
				}}
			
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
						break;
					}
				}
				}
			
				for(int z=1;z<8;z++)
				{
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
				}
				}
				
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
				////////////////////////////////////////////////////////
				for(int z=1;z<8;z++) {
				if(x+z<8)
				{
					if(matriz[x+z][y]==0)
					{
						botao[x+z][y].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
					}
					
					if(matriz[x+z][y]>0)
					{
						botao[x+z][y].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
						break;
					}
					if(matriz[x+z][y]<0)
					{
						break;
					}
				}}
				
				for(int z=1;z<8;z++) {
				if(x-z>=0)
				{
					if(matriz[x-z][y]==0)
					{
						botao[x-z][y].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
					}
					if(matriz[x-z][y]>0)
					{
						botao[x-z][y].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
						break;
					}
					if(matriz[x-z][y]<0)
					{
						break;
					}
				}}
				
				for(int z=1;z<8;z++) {
				if(y-z>=0)
				{
					if(matriz[x][y-z]==0)
					{
						botao[x][y-z].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
					}
					if(matriz[x][y-z]>0)
					{
						botao[x][y-z].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
						break;
					}
					if(matriz[x][y-z]<0)
					{
						break;
					}
					
				}}
				for(int z=1;z<8;z++) {
				if(y+z<8)
				{
					if(matriz[x][y+z]==0)
					{
						botao[x][y+z].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
					}
					if(matriz[x][y+z]>0)
					{
						botao[x][y+z].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
						break;
					}
					if(matriz[x][y+z]<0)
					{
						
						break;
					}
				}}	
			
		}
		
	}
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void troca_pecas(int matriz[][],JButton botao[][],int move_x,int move_y,int x,int y,int cor)
	{
		matriz[move_x][move_y]=0;
		matriz[x][y]=cor;
		if(cor==5)
		botao[x][y].setIcon(rainha_branco());
		if(cor==-5)
			botao[x][y].setIcon(rainha_preto());
		botao[move_x][move_y].setIcon(null);
		botao[move_x][move_y].setBorder(javax.swing.BorderFactory.createLineBorder(null));
	}
		
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void funcao_mover(int matriz[][], int x, int y, JButton botao[][], int move_x, int move_y, int valor) {
		int cor;
		if(matriz[move_x][move_y]==5) {	
			cor=5;
			troca_pecas(matriz,botao, move_x,move_y, x,y,cor);
						if(verifica_check(matriz,x,y))
							JOptionPane.showMessageDialog(null,"CHECKMATE");
				}
		if(matriz[move_x][move_y]==-5) {
			cor=-5;
			troca_pecas(matriz,botao, move_x,move_y, x,y,cor);	
				if(verifica_check(matriz,x,y))
					JOptionPane.showMessageDialog(null,"CHECKMATE");
			}
		}
	
	public void move(int matriz[][], int x, int y, JButton botao[][], int move_x, int move_y, int valor)
	{
		int flag_esq=0, flag_dir=0,flag_cima=0,flag_baixo=0;
		int flag_esq_baixo=0, flag_dir_baixo=0,flag_dir_cima=0,flag_esq_cima=0;
		int i, j;
		///movimentos em linha reta
			for(int cima = move_y-1 ; cima >=0; cima--) {
				if(matriz[x][cima]!=0)
					flag_cima=1;
				if(flag_cima==0)
				{
					if(cima==y && move_x==x)
						funcao_mover(matriz, x, y, botao, move_x, move_y, valor);
				}
					
			}
	    
		for(int baixo = move_y+1 ; baixo <8; baixo++) {
			if(matriz[x][baixo]!=0)
				flag_baixo=1;
			if(flag_baixo==0)
			{
				if(baixo==y && move_x==x)
					funcao_mover(matriz, x, y, botao, move_x, move_y, valor);
			}
		}
		
		for(int dir = move_x+1 ; dir <8; dir++) {
			if(matriz[dir][y]!=0)
				flag_dir=1;
			if(flag_dir==0)
			{
				if(move_y==y && dir==x)
					funcao_mover(matriz, x, y, botao, move_x, move_y, valor);
			}
		}
		
		
		for(int esq = move_x-1 ; esq >=0 ; esq--) {
			if(matriz[esq][y]!=0)
				flag_esq=1;
			if(flag_esq==0)
			{
				if(move_y==y && esq==x)
					funcao_mover(matriz, x, y, botao, move_x, move_y, valor);
			}
		}
		///movimentos em diagonais 
		i=move_x+1;
		j=move_y+1;
		while(i<8&&j<8) {
			if(matriz[i][j]!=0)
				flag_dir_baixo=1;
			if(flag_dir_baixo==0)
			{
				if(j==y && i==x)
					funcao_mover(matriz, x, y, botao, move_x, move_y, valor);
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
					funcao_mover(matriz, x, y, botao, move_x, move_y, valor);
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
					funcao_mover(matriz, x, y, botao, move_x, move_y, valor);
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
					funcao_mover(matriz, x, y, botao, move_x, move_y, valor);
			}
			i++;
			j--;
		}
	}
	
	public boolean verifica_mata(int matriz[][], int x, int y,int move_y,int move_x) {
		int flag_esq=0, flag_dir=0,flag_cima=0,flag_baixo=0;
		int flag_esq_baixo=0, flag_dir_baixo=0,flag_dir_cima=0,flag_esq_cima=0;
		int i, j;
		if(matriz[move_x][move_y]==5) {
			for(int baixo = move_y+1 ; baixo <8; baixo++) {
				if(matriz[x][baixo]>0)
					flag_baixo=1;
				if(matriz[x][baixo]<0 && flag_baixo==0)
				{
					if(baixo==y && move_x==x)
						return true;
					else flag_baixo=1;
				}
			}
			for(int cima = move_y-1 ; cima >=0; cima--) {
				if(matriz[x][cima]>0)
					flag_cima=1;
				if(matriz[x][cima]<0&& flag_cima==0)
				{
					if(cima==y && move_x==x)
						return true;
					else flag_cima=1;
				}
			}
			for(int dir = move_x+1 ; dir<8; dir++) {
				if(matriz[dir][y]>0)
					flag_dir=1;
				if(matriz[dir][y]<0&& flag_dir==0)
				{
					if(move_y==y && dir==x)
						return true;
					else flag_dir=1;
				}
			}
			for(int esq = move_x-1 ; esq>=0; esq--) {
				if(matriz[esq][y]>0)
					flag_esq=1;
				if(matriz[esq][y]<0&& flag_esq==0)
				{
					if(move_y==y && esq==x)
						return true;
					else flag_esq=1;
				}
			}
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
		if(matriz[move_x][move_y]==-5) {
			for(int baixo = move_y+1 ; baixo <8; baixo++) {
				if(matriz[x][baixo]<0)
					flag_baixo=1;
				if(matriz[x][baixo]>0 && flag_baixo==0)
				{
					if(baixo==y && move_x==x)
						return true;
					else flag_baixo=1;
				}
			}
			for(int cima = move_y-1 ; cima >=0; cima--) {
				if(matriz[x][cima]<0)
					flag_cima=1;
				if(matriz[x][cima]>0&& flag_cima==0)
				{
					if(cima==y && move_x==x)
						return true;
					else flag_cima=1;
				}
			}
			for(int dir = move_x+1 ; dir<8; dir++) {
				if(matriz[dir][y]<0)
					flag_dir=1;
				if(matriz[dir][y]>0&& flag_dir==0)
				{
					if(move_y==y && dir==x)
						return true;
					else flag_dir=1;
				}
			}
			for(int esq = move_x-1 ; esq>=0; esq--) {
				if(matriz[esq][y]<0)
					flag_esq=1;
				if(matriz[esq][y]>0&& flag_esq==0)
				{
					if(move_y==y && esq==x)
						return true;
					else flag_esq=1;
				}
			}
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
		if(matriz[move_x][move_y]==5)
		{
			cor=5;
			if(verifica_mata(matriz,x,y,move_y,move_x))
			{
				troca_pecas(matriz,botao, move_x,move_y, x,y,cor);
				if(verifica_check(matriz,x,y))
					JOptionPane.showMessageDialog(null,"CHECKMATE");
			}
			
		}
		
		if(matriz[move_x][move_y]==-5)
		{
			cor=-5;
			if(verifica_mata(matriz,x,y,move_y,move_x))
			{
				troca_pecas(matriz,botao, move_x,move_y, x,y,cor);
				if(verifica_check(matriz,x,y))
					JOptionPane.showMessageDialog(null,"CHECKMATE");
			}
			
		}
	}
	public boolean verifica_check(int matriz[][], int x, int y) {
		int flag_esq=0, flag_dir=0,flag_cima=0,flag_baixo=0;
		int flag_esq_baixo=0, flag_dir_baixo=0,flag_dir_cima=0,flag_esq_cima=0;
		int i, j;
		if(matriz[x][y]==5) {
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
			
			for(int baixo = y+1 ; baixo <8; baixo++) {
				if(matriz[x][baixo]>0)
					flag_baixo=1;
				if(matriz[x][baixo]<0 && flag_baixo==0)
				{
					if(matriz[x][baixo]==-6)
						return true;
					else flag_baixo=1;
				}
			}
			for(int cima = y-1 ; cima >=0; cima--) {
				if(matriz[x][cima]>0)
					flag_cima=1;
				if(matriz[x][cima]<0&& flag_cima==0)
				{
					if(matriz[x][cima]==-6)
						return true;
					else flag_cima=1;
				}
			}
			for(int dir = x+1 ; dir<8; dir++) {
				if(matriz[dir][y]>0)
					flag_dir=1;
				if(matriz[dir][y]<0&& flag_dir==0)
				{
					if(matriz[dir][y]==-6)
						return true;
					else flag_dir=1;
				}
			}
			for(int esq = x-1 ; esq>=0; esq--) {
				if(matriz[esq][y]>0)
					flag_esq=1;
				if(matriz[esq][y]<0&& flag_esq==0)
				{
					if(matriz[esq][y]==-6)
						return true;
					else flag_esq=1;
				}
			}
		}
		if(matriz[x][y]==-5) {
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
			
			for(int baixo = y+1 ; baixo <8; baixo++) {
				if(matriz[x][baixo]<0)
					flag_baixo=1;
				if(matriz[x][baixo]>0 && flag_baixo==0)
				{
					if(matriz[x][baixo]==6)
						return true;
					else flag_baixo=1;
				}
			}
			for(int cima = y-1 ; cima >=0; cima--) {
				if(matriz[x][cima]<0)
					flag_cima=1;
				if(matriz[x][cima]>0&& flag_cima==0)
				{
					if(matriz[x][cima]==6)
						return true;
					else flag_cima=1;
				}
			}
			for(int dir = x+1 ; dir<8; dir++) {
				if(matriz[dir][y]<0)
					flag_dir=1;
				if(matriz[dir][y]>0&& flag_dir==0)
				{
					if(matriz[dir][y]==6)
						return true;
					else flag_dir=1;
				}
			}
			for(int esq = x-1 ; esq>=0; esq--) {
				if(matriz[esq][y]<0)
					flag_esq=1;
				if(matriz[esq][y]>0&& flag_esq==0)
				{
					if(matriz[esq][y]==6)
						return true;
					else flag_esq=1;
				}
			}
			
		}

		return false;
	}
}
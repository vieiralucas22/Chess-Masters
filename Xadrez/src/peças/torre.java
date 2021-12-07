package peças;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class torre {
	
	ImageIcon Tb = new ImageIcon(this.getClass().getResource("/tw.png"));
	ImageIcon Tp = new ImageIcon(this.getClass().getResource("/Tb.png"));
	
	public ImageIcon torre_branco()
	{
		return Tb;
	}
	public ImageIcon torre_preto()
	{
		return Tp;
	}
	
	public void seleciona_borda(int matriz[][],JButton botao[][], int x, int y)
	{
		
		int flag_esq=0, flag_dir=0,flag_cima=0,flag_baixo=0;
		if(matriz[x][y]==2) {
			for(int esq=x-1;esq>=0;esq--) {
				if(matriz[esq][y]==0) {
					if(flag_esq==0)
						botao[esq][y].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
				}
				else {
					if(flag_esq==0&&matriz[esq][y]<0) 
						botao[esq][y].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));	
					flag_esq=1;
				}
			}
			for(int dir=x+1;dir<8;dir++) {
				if(matriz[dir][y]==0) {
					if(flag_dir==0)
						botao[dir][y].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
				}
				
				else {
					if(flag_dir==0&&matriz[dir][y]<0) 
						botao[dir][y].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));	
					flag_dir=1;
				}
			}
			for(int cima=y-1;cima>=0;cima--) {
				if(matriz[x][cima]==0) {
					if(flag_cima==0) {
						botao[x][cima].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
					}
				}
				else {
					if(flag_baixo==0&&matriz[x][cima]<0) 
						botao[x][cima].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));	
					flag_cima=1;
				}
			}
			for(int baixo=y+1;baixo<8;baixo++) {
				if(matriz[x][baixo]==0) {
						if(flag_baixo==0) {
							botao[x][baixo].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));	
				}
			}
				else {
					if(flag_baixo==0&&matriz[x][baixo]<0) 
						botao[x][baixo].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));	
					flag_baixo=1;
				}
		  }
		}
		else {
			for(int esq=x-1;esq>=0;esq--) {
				if(matriz[esq][y]==0) {
					if(flag_esq==0)
						botao[esq][y].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
				}
				else {
					if(flag_esq==0&&matriz[esq][y]>0) 
						botao[esq][y].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));	
					flag_esq=1;
				}
			}
			for(int dir=x+1;dir<8;dir++) {
				if(matriz[dir][y]==0) {
					if(flag_dir==0)
						botao[dir][y].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
				}
				else {
					if(flag_dir==0&&matriz[dir][y]>0) 
						botao[dir][y].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));	
					flag_dir=1;
				}
			}
			for(int cima=y-1;cima>=0;cima--) {
				if(matriz[x][cima]==0) {
					if(flag_cima==0)
						botao[x][cima].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
				}
				else 
					{
					if(flag_cima==0&&matriz[x][cima]>0) 
						botao[x][cima].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));	
					flag_cima=1;
					}
			}
			for(int baixo=y+1;baixo<8;baixo++) {
				if(matriz[x][baixo]==0) {
					if(flag_baixo==0)
						botao[x][baixo].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));
				}
				else 
					{
					if(flag_baixo==0&&matriz[x][baixo]>0) 
						botao[x][baixo].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,255,255), 4));	
					flag_baixo=1;
					}
			}
		}
		
	}

	
	public void troca_pecas(int matriz[][],JButton botao[][],int move_x,int move_y,int x,int y,int cor)
	{
		matriz[move_x][move_y]=0;
		matriz[x][y]=cor;
		if(cor==2)
		botao[x][y].setIcon(torre_branco());
		if(cor==-2)
			botao[x][y].setIcon(torre_preto());
		botao[move_x][move_y].setIcon(null);
		botao[move_x][move_y].setBorder(javax.swing.BorderFactory.createLineBorder(null));
	}	
	
	public boolean verifica_mata(int matriz[][], int x, int y,int move_y,int move_x) {
		int flag_esq=0, flag_dir=0,flag_cima=0,flag_baixo=0;
		if(matriz[move_x][move_y]==2) {
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
		}
		if(matriz[move_x][move_y]==-2) {
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
		}
		return false;
	}
	public void mata(int x, int y, int move_y, int move_x,int matriz[][],JButton botao[][])
	{
		int cor;
		if(matriz[move_x][move_y]==2)
		{
			cor=2;
					if(verifica_mata(matriz,x,y,move_y,move_x))
			{
				troca_pecas(matriz,botao, move_x,move_y, x,y,cor);
				if(verifica_check(matriz,x,y))
					JOptionPane.showMessageDialog(null,"CHECKMATE");
			}
			
		}
		
		if(matriz[move_x][move_y]==-2)
		{
			cor=-2;
			if(verifica_mata(matriz,x,y,move_y,move_x))
			{
				troca_pecas(matriz,botao, move_x,move_y, x,y,cor);
				if(verifica_check(matriz,x,y))
					JOptionPane.showMessageDialog(null,"CHECKMATE");
			}
			
		}
	}
	
	public void funcao_mover(int matriz[][], int x, int y, JButton botao[][], int move_x, int move_y, int valor) {
		int cor;
		if(matriz[move_x][move_y]==2) {	
			cor=2;
			troca_pecas(matriz,botao, move_x,move_y, x,y,cor);
						if(verifica_check(matriz,x,y))
							JOptionPane.showMessageDialog(null,"CHECKMATE");
				}
		if(matriz[move_x][move_y]==-2) {
			cor=-2;
			troca_pecas(matriz,botao, move_x,move_y, x,y,cor);
				if(verifica_check(matriz,x,y))
					JOptionPane.showMessageDialog(null,"CHECKMATE");
			}
		}
	
	public void move(int matriz[][], int x, int y, JButton botao[][], int move_x, int move_y, int valor)
	{
		int flag_esq=0, flag_dir=0,flag_cima=0,flag_baixo=0;
	    
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
		
	}
	
	public boolean verifica_check(int matriz[][], int x, int y) {
		int flag_esq=0, flag_dir=0,flag_cima=0,flag_baixo=0;
		if(matriz[x][y]==2) {
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
		if(matriz[x][y]==-2) {
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

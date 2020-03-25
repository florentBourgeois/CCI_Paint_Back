package fr.CCI.LPDAOO.java.paint_Back.model.shapes;

import java.awt.Point;
import java.awt.Rectangle;

abstract public class Shape
{
	protected boolean isSelected = false;

	public void print() {
		System.out.print(this.toString());		
	}
	
	public abstract Point getLoc();

	public abstract void setLoc(Point p);

	public abstract void translate(int dx, int dy);

	public abstract Rectangle getBounds();

	public void select()
	{
		this.isSelected = true;
	}

	public void unSelect()
	{
		this.isSelected = false;
	}

	public void togleSelection()
	{
		if(this.isSelected == false)
		{
			this.select();
		}
		else
		{
			this.isSelected = false;
		}
	}

	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		sb.append("isSelected=");
		sb.append(this.isSelected);
		return sb.toString();
	}

	public boolean isSelected()
	{
		return this.isSelected;
	}
	
}

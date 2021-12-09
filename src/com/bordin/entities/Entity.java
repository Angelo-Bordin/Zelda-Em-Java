package com.bordin.entities;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Entity {

	private BufferedImage sprite;
	protected double x;
	protected double y;
	protected double width;
	protected double height;

	public Entity(int x, int y, int width, int height, BufferedImage sprite) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.sprite = sprite;
	}

	public void setX(int newX) {
		this.x = newX;
	}

	public void setY(int newY) {
		this.y = newY;
	}

	public int getX() {
		return (int) this.x;
	}

	public int getY() {
		return (int) this.y;
	}

	public int getWidth() {
		return (int) this.width;
	}

	public int getHeight() {
		return (int) this.height;
	}

	public void tick() {

	}

	public void render(Graphics g) {
		g.drawImage(sprite, this.getX(), this.getY(), null);
	}

}

/* Copyright (c) 2012-2016 Jesper Öqvist <jesper@llbit.se>
 *
 * This file is part of Chunky.
 *
 * Chunky is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Chunky is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with Chunky.  If not, see <http://www.gnu.org/licenses/>.
 */
package se.llbit.chunky.renderer;

import java.awt.Graphics;

/**
 * A renderer renders to a buffered image which in turn is displayed by a render canvas.
 * @author Jesper Öqvist <jesper@llbit.se>
 */
public interface Renderer {
	/**
	 * Draws the buffered image to the given graphics context.
	 */
	public void drawBufferedImage(Graphics g, int offsetX, int offsetY, int width, int height);

	/**
	 * Set the buffer update flag. The buffer update flag decides whether the
	 * renderer should update the buffered image.
	 */
	public void setBufferFinalization(boolean finalizationEnabled);

	public void addSceneStatusListener(SceneStatusListener listener);

	public void removeSceneStatusListener(SceneStatusListener listener);
}

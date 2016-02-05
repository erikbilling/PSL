/*-------------------------------------------------------------------*\
THIS SOURCE IS PART OF THE HPL-FRAMEWORK - www.cognitionreversed.com

Copyright 2011 Benjamin Fonooni and Erik Billing
 fonooni@cs.umu.se, billing@cs.umu.se
Department of Computing Science, Umea University, Sweden,
(http://www.cognitionreversed.com).

LICENSE:

This program is free software; you can redistribute it and/or
modify it under the terms of the GNU General Public License
as published by the Free Software Foundation; either version 2
of the License, or (at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 59 Temple Place - Suite 330, Boston,
MA 02111-1307, USA.
\*-------------------------------------------------------------------*/
package se.umu.cs.robotics.lokarria.telemeter;

public class Ultrasonic {
	
	private double distance;
	private double minDistance;
	private double maxDistance;
	
	public double getDistance() {
		return distance;
	}
	
	public void setDistance(double distance) {
		this.distance = distance;
	}
	
	public double getMinDistance() {
		return minDistance;
	}
	
	public void setMinDistance(double minDistance) {
		this.minDistance = minDistance;
	}
	
	public double getMaxDistance() {
		return maxDistance;
	}
	
	public void setMaxDistance(double maxDistance) {
		this.maxDistance = maxDistance;
	}
}
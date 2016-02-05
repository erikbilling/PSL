/*-------------------------------------------------------------------*\
 THIS SOURCE IS PART OF THE HPL-FRAMEWORK - www.cognitionreversed.com

 Copyright 2007 - 2010 Erik Billing
 Department of Computing Science, Umea University, Sweden,
 (www.cs.umu.se/~billing/).

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

package se.umu.cs.robotics.probabilitydistribution;

import java.util.Iterator;
import se.umu.cs.robotics.statespace.StateDimension;
import se.umu.cs.robotics.statespace.StateSpace;

/**
 * A multi-dimensional probability distribution over all dimensions in a a state space.
 *
 * @see ProbabilityDistribution
 * @see StateSpace
 * @author Erik Billing
 */
public interface SpaceDistribution<E> {

    /**
     * @return the state space over which this probiability distribution is defined
     */
    StateSpace<E> stateSpace();

    /**
     * @param dim the descired dimension
     * @return a single dimension of this probability distribution
     */
    ProbabilityDistribution<E> getDimension(int dim);

    /**
     * @param dim
     * @return a single dimension of this probability distribution
     */
    ProbabilityDistribution<E> getDimension(StateDimension<E> dim);

    /**
     * @return a distribution iterator over all dimensions
     */
    Iterator<? extends ProbabilityDistribution<E>> dimensions();

    /**
     * Returns the intersection between this and the specified probability distribution. Both distributions must be over the same space.
     * @param pd
     * @return the intersection between this and the specified probability distribution
     */
    double intersection(SpaceDistribution<E> pd);

    /**
     * @return true if all dimensions have uniform distributions
     */
    boolean isUniform();
}

/**
 * 
 */
package com.tanwei.simplefactory.pizzaproduct;

import com.tanwei.simplefactory.INoodles;

/**
 * @author pc
 *具体的产品vegglePizza
 */
public class PaoNoodles extends INoodles {

	@Override
	public void desc() {
		System.out.println("泡面吃多了会吐");
	}

	
}

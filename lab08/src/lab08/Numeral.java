/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08;


public class Numeral extends Expression{
    private int value;

	public Numeral() {
	}

	public Numeral(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		String num = Integer.toString(value);
		return num;	
	}

	@Override
	public int evaluate() {
		return this.value;
	}
}

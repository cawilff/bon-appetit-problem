/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package com.hackerrank;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @version $Id$
 */
public class BonAppetitProblem {

	// Complete the bonAppetit function below.
	static void bonAppetit(List<Integer> bill, int k, int b) {
		// n ordered elements
		// k index on array
		// b charge
		int bActual = calculatePartnerBill(bill, k, b);
		int owe = b - bActual;

		if (b == bActual) {
			System.out.println("Bon Appetit");

		} else {
			System.out.println(owe);
		}

	}

	static int calculatePartnerBill(List<Integer> bill, int k, int b) {
		int sum = 0;
		int billPartner = 0;
		for (int i = 0; i < bill.size(); i++) {
			if (i == k) {
				sum = sum + 0;
			} else {
				sum = sum + bill.get(i);
			}
		}
		billPartner = sum / 2;
		return billPartner;
	}

	public static void main(String[] args) throws IOException {

		List<Integer> bill = new ArrayList<>();
		bill.add(3);
		bill.add(10);
		bill.add(2);
		bill.add(9);

		int k = 1;
		int b = 12;
		bonAppetit(bill, k, b);
		
		//case 2
		int k2 = 1;
		int b2 = 7;
		bonAppetit(bill, k2, b2);

	}
}

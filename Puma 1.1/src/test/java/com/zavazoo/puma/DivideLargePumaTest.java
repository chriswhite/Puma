/*
 * Zavazoo Puma 1.1 - Java API for Precise Unbounded MAthematics 
 * Copyright (C) 2011-2013 Chris White <chriswhitelondon@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.zavazoo.puma;

import com.zavazoo.puma.Puma;

/**
 * Tests the divide operation on Puma numbers which are very large.
 * 
 * @author Chris White <chriswhitelondon@gmail.com>
 * @since JDK6
 */
public class DivideLargePumaTest extends AbstractLargePumaTest {

	/**
	 * Tests the divide operation on Puma numbers which are very large.
	 */
	public void testLarge() {

		try {

			Puma subject = new Puma(
					"38742389428197356821375980273872130562108772975982375923875908235823587216348217509315.019879108709823750896508732589734098608343045384583475980327509832509837502385000");
			Puma candidate = new Puma(
					"312452364152756047513098573940873098473986543801789034769834793876938470897509286.8712358912374587162358716235878935798032759081750981759871348957130851908751743875581798057108");

			assertEquals(subject.divide(candidate).toString(), divide(subject,
					candidate).toString());

			subject = new Puma(
					"-38742389428197356821375980273872130562108772975982375923875908235823587216348217509315.019879108709823750896508732589734098608343045384583475980327509832509837502385000");
			candidate = new Puma(
					"312452364152756047513098573940873098473986543801789034769834793876938470897509286.8712358912374587162358716235878935798032759081750981759871348957130851908751743875581798057108");

			assertEquals(subject.divide(candidate).toString(), divide(subject,
					candidate).toString());

			subject = new Puma(
					"38742389428197356821375980273872130562108772975982375923875908235823587216348217509315.019879108709823750896508732589734098608343045384583475980327509832509837502385000");
			candidate = new Puma(
					"-312452364152756047513098573940873098473986543801789034769834793876938470897509286.8712358912374587162358716235878935798032759081750981759871348957130851908751743875581798057108");

			assertEquals(subject.divide(candidate).toString(), divide(subject,
					candidate).toString());

			subject = new Puma(
					"-38742389428197356821375980273872130562108772975982375923875908235823587216348217509315.019879108709823750896508732589734098608343045384583475980327509832509837502385000");
			candidate = new Puma(
					"-312452364152756047513098573940873098473986543801789034769834793876938470897509286.8712358912374587162358716235878935798032759081750981759871348957130851908751743875581798057108");

			assertEquals(subject.divide(candidate).toString(), divide(subject,
					candidate).toString());

			subject = new Puma(
					"38742389428197356821375980273872130562108772975982375923875908235823587216348217509315.019879108709823750896508732589734098608343045384583475980327509832509837502385000 / 2398492803761235876231785981237589023175082735083875674584759873429807027590327585.3918758913759871365138761874356981759087130958734098518734816587326010985");
			candidate = new Puma(
					"312452364152756047513098573940873098473986543801789034769834793876938470897509286.8712358912374587162358716235878935798032759081750981759871348957130851908751743875581798057108 / 291491298498213748912749872135865781325897324598231759832750913285098134798018917.12873468712365871239878329598231132989328579813259182759823589327");

			assertEquals(subject.divide(candidate).toString(), divide(subject,
					candidate).toString());

			subject = new Puma(
					"38742389428197356821375980273872130562108772975982375923875908235823587216348217509315.01987910870982375089650873258973409860834304538458347598032750983250983750238500023984928037612358762317859812375890231750827350838756745847598734298070275903275853918758913759871365138761874356981759087130958734098518734816587326010985");
			candidate = new Puma(
					"312452364152756047513098573940873098473986543801789034769834793876938470897509286.8712358912374587162358716235878935798032759081750981759871348957130851908751743875581798057108 / 291491298498213748912749872135865781325897324598231759832750913285098134798018917.12873468712365871239878329598231132989328579813259182759823589327");

			assertEquals(subject.divide(candidate).toString(), divide(subject,
					candidate).toString());

			subject = new Puma(
					"38742389428197356821375980273872130562108772975982375923875908235823587216348217509315.019879108709823750896508732589734098608343045384583475980327509832509837502385000 / 2398492803761235876231785981237589023175082735083875674584759873429807027590327585.3918758913759871365138761874356981759087130958734098518734816587326010985");
			candidate = new Puma(
					"312452364152756047513098573940873098473986543801789034769834793876938470897509286.871235891237458716235871623587893579803275908175098175987134895713085190875174387558179805710829149129849821374891274987213586578132589732459823175983275091328509813479801891712873468712365871239878329598231132989328579813259182759823589327");

			assertEquals(subject.divide(candidate).toString(), divide(subject,
					candidate).toString());

			subject = new Puma(
					"38742389428197356821375980273872130562108772975982375923875908235823587216348217509315.019879108709823750896508732589734098608343045384583475980327509832509837502385000 / 2398492803761235876231785981237589023175082735083875674584759873429807027590327585.3918758913759871365138761874356981759087130958734098518734816587326010985");
			candidate = new Puma("1/3");

			assertEquals(subject.divide(candidate).toString(), divide(subject,
					candidate).toString());

		} catch (Exception error) {

			error.printStackTrace();

		}

	}

}
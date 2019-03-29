package changeMaker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ChangeMakerTest_Laursen {
	
	public static void main(String[] args) {

//		Set<Integer> denominations1 = new HashSet<Integer>();
//		denominations1.add(100);
//		denominations1.add(25);
//		denominations1.add(10);
//		denominations1.add(5);
//		denominations1.add(1);
//		ChangeMaker change0 = new ChangeMakerImpl_Laursen(denominations1);
//		System.out.println(change0.getExactChange(65));
//		System.out.println(change0.getDenominations());
		
		new ChangeMakerImpl_Laursen(new HashSet<Integer>(Arrays.asList(new Integer[] {100, 25, 10, 5, 1}))).canMakeExactChange(95);
		

//	Set<Integer> test = new HashSet<>(Arrays.asList(new Integer[] {1, 25, 10, 5, 100})); 
//	ChangeMaker change = new ChangeMakerImpl_Laursen(test);
//	//assert change.canMakeExactChange(23);
//	System.out.println(change.getExactChange(23));
//	System.out.println(change.getDenominations());
	//List<Integer> changeList = Arrays.asList(new Integer[] {0, 1, 2, 3, 4}); 
	//System.out.println(change.calculateValueOfChangeList(changeList));
//	
//	ChangeMaker changeMaker = new ChangeMakerImpl_Laursen({100, 25, 10, 5, 1});
//	ChangeMakerImpl_Laursen({100, 25, 10, 5, 1}).canMakeExactChange(65);
//	assert changeMaker[100, 25, 10, 5, 1];
//	ChangeMakerImpl_Laursen([100, 25, 10, 5, 1]);
//	[100, 25, 10, 5, 1].getExactChange(65);
//	[100, 25, 10, 5, 1].canMakeExactChange(55);

	Set<Integer> test1 = new HashSet<>(Arrays.asList(new Integer[] {100, 25, 10, 5, 1}));
	ChangeMaker change1 = new ChangeMakerImpl_Laursen(test1);
	System.out.println("canMakeExactChange(65): " + change1.canMakeExactChange(65));
	
	Set<Integer> test2 = new HashSet<>(Arrays.asList(new Integer[] {100, 25, 10, 5, 1}));
	ChangeMaker change2 = new ChangeMakerImpl_Laursen(test2);
	System.out.println("getExactChange(65): " + change2.getExactChange(65));
	
	Set<Integer> test3 = new HashSet<>(Arrays.asList(new Integer[] {100, 25, 10, 5, 1}));
	ChangeMaker change3 = new ChangeMakerImpl_Laursen(test3);
	System.out.println("canMakeExactChange(55): " + change1.canMakeExactChange(55));
	
	Set<Integer> test4 = new HashSet<>(Arrays.asList(new Integer[] {100, 25, 10, 5, 1}));
	ChangeMaker change4 = new ChangeMakerImpl_Laursen(test4);
	System.out.println("canMakeExactChange(10): " + change4.canMakeExactChange(10));
	
	Set<Integer> test5 = new HashSet<>(Arrays.asList(new Integer[] {100, 25, 10, 5, 1}));
	ChangeMaker change5 = new ChangeMakerImpl_Laursen(test5);
	System.out.println("canMakeExactChange(11): " + change5.canMakeExactChange(11));
	
	Set<Integer> test6 = new HashSet<>(Arrays.asList(new Integer[] {100, 25, 10, 5, 1}));
	ChangeMaker change6 = new ChangeMakerImpl_Laursen(test6);
	System.out.println("canMakeExactChange(180004): " + change6.canMakeExactChange(180004));
	
	Set<Integer> testba = new HashSet<>(Arrays.asList(new Integer[] {100, 25, 10, 5, 1}));
	ChangeMaker changeba = new ChangeMakerImpl_Laursen(testba);
	System.out.println("canMakeExactChange(1269): " + changeba.getExactChange(99999));
	
	System.out.println("--------------------");
	
	Set<Integer> test7 = new HashSet<>(Arrays.asList(new Integer[] {32, 16, 8, 4, 2, 1}));
	ChangeMaker change7 = new ChangeMakerImpl_Laursen(test7);
	System.out.println("canMakeExactChange(0): " + change7.canMakeExactChange(0));
	
	Set<Integer> test8 = new HashSet<>(Arrays.asList(new Integer[] {32, 16, 8, 4, 2, 1}));
	ChangeMaker change8 = new ChangeMakerImpl_Laursen(test8);
	System.out.println("getExactChange(0): " + change8.getExactChange(0));
	
	
	System.out.println("--------------------");
	
	Set<Integer> test9 = new HashSet<>(Arrays.asList(new Integer[] {32, 16, 8, 4, 2, 1}));
	ChangeMaker change9 = new ChangeMakerImpl_Laursen(test9);
	System.out.println("[32, 16, 8, 4, 2, 1].canMakeExactChange(0): " + change9.canMakeExactChange(0));
	
	Set<Integer> test10 = new HashSet<>(Arrays.asList(new Integer[] {32, 16, 8, 4, 2, 1}));
	ChangeMaker change10 = new ChangeMakerImpl_Laursen(test10);
	System.out.println("[32, 16, 8, 4, 2, 1].getExactChange(0): " + change10.getExactChange(0));
	
	System.out.println("--------------------");
	
	Set<Integer> test11 = new HashSet<>(Arrays.asList(new Integer[] {100000000, 10000000, 1000000, 100000, 10000, 1000, 100, 10, 1}));
	ChangeMaker change11 = new ChangeMakerImpl_Laursen(test11);
	System.out.println("canMakeExactChange(0): " + change11.canMakeExactChange(123456789));
	
	Set<Integer> test12 = new HashSet<>(Arrays.asList(new Integer[] {100000000, 10000000, 1000000, 100000, 10000, 1000, 100, 10, 1}));
	ChangeMaker change12 = new ChangeMakerImpl_Laursen(test12);
	System.out.println("getExactChange(0): " + change12.getExactChange(123456789));
	
	System.out.println("--------------------");

	Set<Integer> test13 = new HashSet<>(Arrays.asList(new Integer[] {144, 89, 55, 34, 21, 13, 8, 5, 3, 2, 1}));
	ChangeMaker change13 = new ChangeMakerImpl_Laursen(test13);
	System.out.println("[144, 89, 55, 34, 21, 13, 8, 5, 3, 2, 1].canMakeExactChange(0): " + change13.canMakeExactChange(0));
	
	Set<Integer> test14 = new HashSet<>(Arrays.asList(new Integer[] {144, 89, 55, 34, 21, 13, 8, 5, 3, 2, 1}));
	ChangeMaker change14 = new ChangeMakerImpl_Laursen(test14);
	System.out.println("[144, 89, 55, 34, 21, 13, 8, 5, 3, 2, 1].canMakeExactChange(201): " + change14.canMakeExactChange(201));
	
	Set<Integer> test15 = new HashSet<>(Arrays.asList(new Integer[] {144, 89, 55, 34, 21, 13, 8, 5, 3, 2, 1}));
	ChangeMaker change15 = new ChangeMakerImpl_Laursen(test15);
	System.out.println("[144, 89, 55, 34, 21, 13, 8, 5, 3, 2, 1].getExactChange(201): " + change15.getExactChange(201));
	
	System.out.println("--------------------");
	
	Set<Integer> test16 = new HashSet<>(Arrays.asList(new Integer[] {16777216, 2097152, 262144, 32768, 4096, 512, 64, 8, 1}));
	ChangeMaker change16 = new ChangeMakerImpl_Laursen(test16);
	System.out.println("[16777216, 2097152, 262144, 32768, 4096, 512, 64, 8}].canMakeExactChange(88888888): " + change16.canMakeExactChange(88888888));
	
	Set<Integer> test17 = new HashSet<>(Arrays.asList(new Integer[] {16777216, 2097152, 262144, 32768, 4096, 512, 64, 8, 1}));
	ChangeMaker change17 = new ChangeMakerImpl_Laursen(test17);
	System.out.println("[16777216, 2097152, 262144, 32768, 4096, 512, 64, 8}].getExactChange(88888888): " + change17.getExactChange(88888888));
	
	System.out.println("--------------------");
	
	Set<Integer> test18 = new HashSet<>(Arrays.asList(new Integer[] {537824, 38416, 2744, 196, 14, 1}));
	List<Integer> calcValue18 = new ArrayList<Integer>();
	ChangeMaker change18 = new ChangeMakerImpl_Laursen(test18);
	calcValue18.add(0);
	calcValue18.add(0);
	calcValue18.add(0);
	calcValue18.add(0);
	calcValue18.add(0);
	calcValue18.add(0);
	System.out.println("[537824, 38416, 2744, 196, 14, 1].calculateValueofChangeList([0, 0, 0, 0, 0, 0]): " + change18.calculateValueOfChangeList(calcValue18));
	
	Set<Integer> test19 = new HashSet<>(Arrays.asList(new Integer[] {144, 89, 55, 34, 21, 13, 8, 5, 3, 2, 1}));
	List<Integer> calcValue19 = new ArrayList<Integer>();
	ChangeMaker change19 = new ChangeMakerImpl_Laursen(test19);
	calcValue19.add(0);
	calcValue19.add(0);
	calcValue19.add(0);
	calcValue19.add(0);
	calcValue19.add(0);
	calcValue19.add(0);
	calcValue19.add(0);
	calcValue19.add(3);
	calcValue19.add(2);
	calcValue19.add(1);
	calcValue19.add(0);
	System.out.println("[537824, 38416, 2744, 196, 14, 1].calculateValueofChangeList([0, 0, 0, 0, 0, 0]): " + change19.calculateValueOfChangeList(calcValue19));
	

	System.out.println("--------------------");
	
	Set<Integer> test20 = new HashSet<>(Arrays.asList(new Integer[] {8000, 400, 20, 1}));
	ChangeMaker change20 = new ChangeMakerImpl_Laursen(test20);
	System.out.println("8000, 400, 20, 1}].canMakeExactChange(492): " + change20.canMakeExactChange(492));
	
	Set<Integer> test21 = new HashSet<>(Arrays.asList(new Integer[] {8000, 400, 20, 1}));
	ChangeMaker change21 = new ChangeMakerImpl_Laursen(test21);
	System.out.println("8000, 400, 20, 1}].getExactChange(492): " + change21.getExactChange(492));
	//returning 12 for the last number is fine because this is a list
	
	System.out.println("--------------------");
	
	Set<Integer> test22 = new HashSet<>(Arrays.asList(new Integer[] {11, 7}));
	ChangeMaker change22 = new ChangeMakerImpl_Laursen(test22);
	System.out.println("11, 7}].canMakeExactChange(1): " + change22.canMakeExactChange(1));
	
	Set<Integer> test23 = new HashSet<>(Arrays.asList(new Integer[] {11, 7}));
	ChangeMaker change23 = new ChangeMakerImpl_Laursen(test23);
	System.out.println("11, 7}].canMakeExactChange(2): " + change23.canMakeExactChange(2));
	
	Set<Integer> test24 = new HashSet<>(Arrays.asList(new Integer[] {11, 7}));
	ChangeMaker change24 = new ChangeMakerImpl_Laursen(test24);
	System.out.println("11, 7}].canMakeExactChange(3): " + change24.canMakeExactChange(3));
	
	Set<Integer> test25 = new HashSet<>(Arrays.asList(new Integer[] {11, 7}));
	ChangeMaker change25 = new ChangeMakerImpl_Laursen(test25);
	System.out.println("11, 7}].canMakeExactChange(4): " + change25.canMakeExactChange(4));
	
	Set<Integer> test26 = new HashSet<>(Arrays.asList(new Integer[] {11, 7}));
	ChangeMaker change26 = new ChangeMakerImpl_Laursen(test26);
	System.out.println("11, 7}].canMakeExactChange(5): " + change26.canMakeExactChange(5));
	
	Set<Integer> test27 = new HashSet<>(Arrays.asList(new Integer[] {11, 7}));
	ChangeMaker change27 = new ChangeMakerImpl_Laursen(test27);
	System.out.println("11, 7}].canMakeExactChange(6): " + change27.canMakeExactChange(6));
	
	Set<Integer> test28 = new HashSet<>(Arrays.asList(new Integer[] {11, 7}));
	ChangeMaker change28= new ChangeMakerImpl_Laursen(test28);
	System.out.println("11, 7}].canMakeExactChange(8): " + change28.canMakeExactChange(8));
	
	Set<Integer> test29 = new HashSet<>(Arrays.asList(new Integer[] {11, 7}));
	ChangeMaker change29 = new ChangeMakerImpl_Laursen(test29);
	System.out.println("11, 7}].canMakeExactChange(9): " + change29.canMakeExactChange(9));
	
	Set<Integer> test30 = new HashSet<>(Arrays.asList(new Integer[] {11, 7}));
	ChangeMaker change30 = new ChangeMakerImpl_Laursen(test30);
	System.out.println("11, 7}].canMakeExactChange(10): " + change30.canMakeExactChange(10));
	
	Set<Integer> test31 = new HashSet<>(Arrays.asList(new Integer[] {11, 7}));
	ChangeMaker change31 = new ChangeMakerImpl_Laursen(test31);
	System.out.println("11, 7}].canMakeExactChange(12): " + change31.canMakeExactChange(12));
	
	Set<Integer> testx = new HashSet<>(Arrays.asList(new Integer[] {11, 7}));
	ChangeMaker changex = new ChangeMakerImpl_Laursen(testx);
	System.out.println("11, 7}].canMakeExactChange(13): " + changex.canMakeExactChange(13));
	
	System.out.println("--------------------");

	Set<Integer> test32 = new HashSet<>(Arrays.asList(new Integer[] {65536, 4096, 256, 16, 1}));
	ChangeMaker change32 = new ChangeMakerImpl_Laursen(test32);
	System.out.println("65536, 4096, 256, 16, 1}].canMakeExactChange(78704): " + change32.canMakeExactChange(78704));
	
	Set<Integer> test33 = new HashSet<>(Arrays.asList(new Integer[] {65536, 4096, 256, 16, 1}));
	ChangeMaker change33 = new ChangeMakerImpl_Laursen(test33);
	System.out.println("65536, 4096, 256, 16, 1}].canMakeExactChange(78704): " + change33.getExactChange(78704));
	
	System.out.println("--------------------");

	Set<Integer> test34 = new HashSet<>(Arrays.asList(new Integer[] {100, 25, 10, 5, 1}));
	ChangeMaker change34 = new ChangeMakerImpl_Laursen(test34);
	System.out.println("100, 25, 10, 5, 1}}].canMakeExactChange(0): " + change34.canMakeExactChange(0));
	
	Set<Integer> test35 = new HashSet<>(Arrays.asList(new Integer[] {100, 25, 10, 5, 1}));
	ChangeMaker change35 = new ChangeMakerImpl_Laursen(test35);
	System.out.println("100, 25, 10, 5, 1}].getExactChange(0): " + change35.getExactChange(0));
	
	//8000, 400, 20, 1
	Set<Integer> testa = new HashSet<>(Arrays.asList(new Integer[] {8000, 400, 20, 1}));
	ChangeMaker changea = new ChangeMakerImpl_Laursen(testa);
	System.out.println("8000, 400, 20, 1}].getExactChange(0): " + changea.getExactChange(492));
	
	Set<Integer> testb = new HashSet<>(Arrays.asList(new Integer[] {8000, 400, 20, 1}));
	ChangeMaker changeb = new ChangeMakerImpl_Laursen(testb);
	System.out.println("8000, 400, 20, 1].canMakeExactChange(0): " + changeb.canMakeExactChange(492));
	
	
	Set<Integer> test36 = new HashSet<>(Arrays.asList(new Integer[] {256, 128, 64, 32, 16, 8, 4, 2, 1}));
	List<Integer> calcValue36 = new ArrayList<Integer>();
	ChangeMaker change36 = new ChangeMakerImpl_Laursen(test36);
	calcValue36.add(0);
	calcValue36.add(0);
	calcValue36.add(0);
	calcValue36.add(0);
	calcValue36.add(1);
	calcValue36.add(1);
	calcValue36.add(0);
	calcValue36.add(1);
	calcValue36.add(1);
	System.out.println("[537824, 38416, 2744, 196, 14, 1].calculateValueofChangeList([0, 0, 0, 0, 0, 0]): " + change36.calculateValueOfChangeList(calcValue36));
	//should return 27
	
	System.out.println("--------------------");

	//58
	//58
	System.out.println("--------------------");

	//14
	//14
	
	System.out.println("--------------------");


	Set<Integer> test37 = new HashSet<>(Arrays.asList(new Integer[] {10}));
	ChangeMaker change37 = new ChangeMakerImpl_Laursen(test37);
	System.out.println("[10].canMakeExactChange(10): " + change37.canMakeExactChange(10));
	
	Set<Integer> test38 = new HashSet<>(Arrays.asList(new Integer[] {10}));
	ChangeMaker change38 = new ChangeMakerImpl_Laursen(test38);
	System.out.println("[10].canMakeExactChange(10): " + change38.canMakeExactChange(20));
	
	Set<Integer> test39 = new HashSet<>(Arrays.asList(new Integer[] {10}));
	ChangeMaker change39 = new ChangeMakerImpl_Laursen(test39);
	System.out.println("[10].canMakeExactChange(10): " + change39.canMakeExactChange(30));
	
	Set<Integer> test40 = new HashSet<>(Arrays.asList(new Integer[] {10}));
	ChangeMaker change40 = new ChangeMakerImpl_Laursen(test40);
	System.out.println("[10].canMakeExactChange(10): " + change40.canMakeExactChange(40));
	
	Set<Integer> test41 = new HashSet<>(Arrays.asList(new Integer[] {10}));
	ChangeMaker change41 = new ChangeMakerImpl_Laursen(test41);
	System.out.println("[10].canMakeExactChange(10): " + change41.canMakeExactChange(50));
	
	Set<Integer> test42 = new HashSet<>(Arrays.asList(new Integer[] {10}));
	ChangeMaker change42 = new ChangeMakerImpl_Laursen(test42);
	System.out.println("[10].canMakeExactChange(10): " + change42.canMakeExactChange(1));
	
	Set<Integer> test43 = new HashSet<>(Arrays.asList(new Integer[] {10}));
	ChangeMaker change43 = new ChangeMakerImpl_Laursen(test43);
	System.out.println("[10].canMakeExactChange(10): " + change43.canMakeExactChange(2));
	
	Set<Integer> test44 = new HashSet<>(Arrays.asList(new Integer[] {10}));
	ChangeMaker change44 = new ChangeMakerImpl_Laursen(test44);
	System.out.println("[10].canMakeExactChange(10): " + change44.canMakeExactChange(3));
	
	Set<Integer> test45 = new HashSet<>(Arrays.asList(new Integer[] {10}));
	ChangeMaker change45 = new ChangeMakerImpl_Laursen(test45);
	System.out.println("[10].canMakeExactChange(10): " + change45.canMakeExactChange(4));
	
	Set<Integer> test46 = new HashSet<>(Arrays.asList(new Integer[] {10}));
	ChangeMaker change46 = new ChangeMakerImpl_Laursen(test46);
	System.out.println("[10].canMakeExactChange(10): " + change46.canMakeExactChange(5));
	
	Set<Integer> test47 = new HashSet<>(Arrays.asList(new Integer[] {10}));
	ChangeMaker change47 = new ChangeMakerImpl_Laursen(test47);
	System.out.println("[10].canMakeExactChange(10): " + change47.canMakeExactChange(6));
	
	Set<Integer> test48 = new HashSet<>(Arrays.asList(new Integer[] {10}));
	ChangeMaker change48 = new ChangeMakerImpl_Laursen(test48);
	System.out.println("[10].canMakeExactChange(10): " + change48.canMakeExactChange(7));
	
	Set<Integer> test49 = new HashSet<>(Arrays.asList(new Integer[] {10}));
	ChangeMaker change49 = new ChangeMakerImpl_Laursen(test49);
	System.out.println("[10].canMakeExactChange(10): " + change49.canMakeExactChange(8));
	
	Set<Integer> test50 = new HashSet<>(Arrays.asList(new Integer[] {10}));
	ChangeMaker change50 = new ChangeMakerImpl_Laursen(test50);
	System.out.println("[10].canMakeExactChange(10): " + change50.canMakeExactChange(9));
	
//	Set<Integer> test51 = new HashSet<>(Arrays.asList(new Integer[] {-10}));
	//ChangeMaker change51 = new ChangeMakerImpl_Laursen(test51);
	//System.out.println("[10].canMakeExactChange(-10): " + change51.canMakeExactChange(10));
	
	System.out.println("----------------");
	Set<Integer> test52 = new HashSet<>(Arrays.asList(new Integer[]{(int) 10E8, (int) 10E7, (int) 10E6, (int) 10E5, (int)10E4, (int)10E3, (int)10E2, (int) 10E1, 123456789}));
	ChangeMaker change52 = new ChangeMakerImpl_Laursen(test52);
	System.out.println("[E set].canMakeExactChange(0): " + change52.canMakeExactChange(0));
	}
}
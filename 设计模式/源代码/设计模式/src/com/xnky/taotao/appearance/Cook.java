package com.xnky.taotao.appearance;
/**
 * 做饭/炒菜
 * @author 孙雪锋
 *
 */
public class Cook {
	private Bench bench=new Bench();
	private CookRice cookRice = new CookRice();
	private Food food = new Food();
	private  RiceCooker riceCooker= new  RiceCooker();
	
	/**
	 * 做饭
	 */
	public void CookRice(){
		riceCooker.pot();
		cookRice.pourIn();
		cookRice.washRice();
		cookRice.addWater();
		cookRice.in();
		riceCooker.pulgIn();
	}
	/**
	 * 炒菜
	 */
	public void stirFry(){
		food.pick();
		food.Wash();
		food.cut();
		bench.Wash();
		bench.open();
		bench.pouROil();
		bench.pourRice();
		food.fry();
		bench.risePot();
	}
     /***
               * 关闭电饭锅电源
      */
	public void colseRiceCooker(){
		riceCooker.pulgOut();
	}
	/**
	 * 关闭灶台煤气
	 */
	public void colseBench(){
		bench.close();
	}
}

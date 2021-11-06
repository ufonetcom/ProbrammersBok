package otc4th;

import java.util.HashMap;

public class Ep3 {
	public int solution(String[] ings, String[] menu, String[] sell) {
        int answer = 0;
        
        HashMap<String, Integer> ingsMap = new HashMap<String, Integer>();
        HashMap<String,Integer> sellPrice = new HashMap<String, Integer>();
        HashMap<String, Object> menuMap = new HashMap<String, Object>();
        
        HashMap<String, Integer> menu_price_map = new HashMap<String, Integer>();//필요한재료의 중복값을 제어하기 위한 map.
        
        //ingsMap 생성
        for(String c : ings) {
        	String[] ing_val = c.split(" ");
        	int ing_price = Integer.parseInt(ing_val[1]);
        	ingsMap.put(ing_val[0], ing_price);
        }
        
        //menuMap 생성
        for(String c: menu) {
        	String[] menu_val = c.split(" ");
        	String menu_name = menu_val[0];
        	String menu_need_ing = menu_val[1];
        	int menu_price = Integer.parseInt(menu_val[2]);
        	
        	menu_price_map.put(menu_name, menu_price);
        	menuMap.put(menu_name, menu_need_ing);
        	sellPrice.put((String) menuMap.get(menu_name), menu_price);
        	
        	
        }
//        for(String x : menuMap.keySet()) {
//        	System.out.println("menu_price_map = "+x + " " + menu_price_map.get(x));
//        }
//        for(String x : menuMap.keySet()) {
//        	System.out.println("menuMap = "+x + " " + menuMap.get(x));
//        }
//        for(String x : sellPrice.keySet()) {
//        	System.out.println("sellPrice = "+x + " " + sellPrice.get(x));
//        }
        
        
        for(int i=0; i<sell.length; i++) {
        	String[] sellArray = sell[i].split(" ");
        	String menu_name = sellArray[0];
        	int sell_count = Integer.parseInt(sellArray[1]);
        	int real_price = 0;
        	
        	System.out.println(menu_name);
        	if(menuMap.containsKey(menu_name)) {
        		String needIngs = (String) menuMap.get(menu_name);
        		
        		System.out.println("필요한 재료 꺼내기 : "+needIngs);
        		int ings_price = 0;
        		for(char s : needIngs.toCharArray()) {
        			ings_price += ingsMap.get(s+"");
        		}
        		System.out.println("순숭익 : "+ings_price);
        		System.out.println("해당 판매가 : "+sellPrice.get(needIngs));
        		int sell_price = menu_price_map.get(menu_name); //물품의 판매가
        		System.out.println("물품의 판매가 : "+sell_price);
        		if(sellPrice.get(needIngs) != sell_price) {
        			real_price = sell_price - ings_price; //물품의 판매가(중복제거된 재료의 관한 판매가)
        		}else {
        			real_price = sellPrice.get(needIngs) - ings_price;
        		}
        		
        		System.out.println(real_price);
        	}
        	answer = answer + (real_price * sell_count);
        	System.out.println(answer);
        	
        	System.out.println();
        }
        
        return answer;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ep3 sol = new Ep3();

		//입력값
		String[] ings = {"r 10", "a 23", "t 124", "k 9"};
		String[] menu = {"PIZZA arraak 145", "HAMBURGER tkar 180", "BREAD kkk 30", "ICECREAM rar 50", "SHAVEDICE rar 45", "JUICE rra 55", "WATER a 20"};
		String[] sell = {"BREAD 5", "ICECREAM 100", "PIZZA 7", "JUICE 10", "WATER 1"};

		System.out.println(sol.solution(ings, menu, sell));
	}

}
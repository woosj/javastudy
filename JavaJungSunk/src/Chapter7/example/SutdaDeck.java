package Chapter7.example;

public class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		/*
		 * (1) 배열 SutdaCard를 적절히 초기화 하시오
		 */
		for(int i = 0; i < 2; i++){
			for(int j = 1; j <= 10; j++){
				if(i == 0 && ( j == 1 || j == 3 || j == 8) ){
					cards[i*10 + (j-1)] = new SutdaCard(j,true);
				}else{
					cards[i*10 + (j-1)] = new SutdaCard(j,false);
				}
			}
		}
		
	}
	/*
	 * (1) 위에 정의된 세 개의 메서드를 작성하시오.
	 */
	public void shuffle(){
		for(int i = 0; i < cards.length*2; i++){
			int n1 = (int)(Math.random()*(cards.length));
			int n2 = (int)(Math.random()*(cards.length));
			
			SutdaCard temp = cards[n1];
			cards[n1] = cards[n2];
			cards[n2] = temp;
			
		}
	}
	
	public SutdaCard pick(){
		int num = 0;
		return cards[num];
		
	}

	public SutdaCard pick(int i){
		
		return cards[i];
		
	}
	
	
	
	
	
} // SutdaDeck

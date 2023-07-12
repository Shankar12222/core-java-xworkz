class Hotstar {
  
  
  static String kannadaMovies []= {"Gaalipata","circus","bombat","pataki","Sakkath"};
  static String teluguMovies []= {"sye","Doctor","tapas","Dasara","RRR","Beast","Bahubali"};
  static String tamilMovies []={"AK62","Abhimanyu","vivegam","Irumugan","Vedalam"};
  static String hindiMovies []={"Kathal","Khufiya","Guns and Gulaabs","Tu Jhoothi Main Makkaar","Chakda Xpress",};
  static String englishMovies []={"Inception","Murder Mystery 2","Tenet","Interstellar","Harry potter"};
  
  
  public static void main(String[] platforms){
    System.out.println(kannadaMovies.length);
    
    
    for(int kannadaIndex=0;  kannadaIndex<kannadaMovies.length; kannadaIndex++ ) {
    System.out.println(kannadaMovies[kannadaIndex]);
  }
  System.out.println(teluguMovies.length);
  
  for(int teluguIndex=0; teluguIndex<teluguMovies.length; teluguIndex++){
    System.out.println(teluguMovies[teluguIndex]);
  }
  System.out.println(tamilMovies.length);
  
  for(int tamilIndex=0; tamilIndex<tamilMovies.length; tamilIndex++){
    System.out.println(tamilMovies[tamilIndex]);
  }
  System.out.println(hindiMovies.length);
  
  for(int hindiIndex=0; hindiIndex<hindiMovies.length;  hindiIndex++){
  System.out.println(hindiMovies[hindiIndex]);
  }
  System.out.println(englishMovies.length);
  
  for(int englishIndex=0; englishIndex<englishMovies.length; englishIndex++){
  System.out.println(englishMovies[englishIndex]);
  }
  
  
  
  
}

}
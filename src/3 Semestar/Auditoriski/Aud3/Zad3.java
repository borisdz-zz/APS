/*
 * TEKST:
 * Дадени се парички со одредена вредност (постојат парички од 50, 10, 5, 2 и 1 денар), и притоа бројот на парички од
 * секоја вредност е неограничен. За дадена сума да се определи најмалиот број на парички кои се потребни да се формира
 * таа сума.
 * */

//class BruteForce{
//    int min_broj_moneti(int suma){
//        int m1, m2, m3, m4,m5, tmp, rezultat = 1000000, br_paricki;
//        for(m1=0;m1<(suma/50);m1++){
//            for(m2=0;m2<(suma/10);m2++){
//                for(m3=0;m3<(suma/5);m3++){
//                    for(m4=0;m4<(suma/2);m4++){
//                        for(m5=0;m5<(suma/1);m5++){
//                            tmp=m1*50+m2*10+m3*5+m4*2+m5*1;
//                            if(tmp==suma){
//                                br_paricki=m1+m2+m3+m4+m5;
//                                if(br_paricki<rezultat){
//                                    rezultat=br_paricki;
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//        }
//        return rezultat;
//    }
//}
//
//public class Zad3 {
//}

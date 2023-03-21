package listaDeExercicios;

import java.util.Scanner;

public class Exercicio21 {
	public static void main (String [] args) {
		Scanner scanner = new Scanner(System.in);
		int saque;
		int n100, n50, n10, n5, n1;
		System.out.print("Informe quanto gostaria de sacar: ");
		saque = scanner.nextInt();
		if(saque > 0 && saque <= 600) {
			n100 = saque/100;
			n50 =(saque%100)/50;
			n10 = ((saque%100)%50)/10;
			n5 = (((saque%100)%50)%10)/5;
			n1 = ((((saque%100)%50)%10)%5)/1;
			if(n100 ==0) {
				if(n50 == 0) {
					if(n10 ==0) {
						if (n5 == 0) {
							if(n1 == 1) {
								System.out.println("Uma nota de R$1");
							}else if(n1==2) {
								System.out.println("Duas notas de R$1");
							}else if(n1==3) {
								System.out.println("Tres notas de R$1"); 
							}else if(n1 ==4) {
								System.out.println("Quatro notas de R$1");
							}
						}else if(n5 >= 1) {
							if(n1 == 1) {
								System.out.println("Uma nota de R$5 e uma nota de R$1");
							}else if(n1==2) {
								System.out.println("Uma nota de R$5 e duas notas de R$1");
							}else if(n1==3) {
								System.out.println("Uma nota de R$5 e tres notas de R$1"); 
							}else if(n1 ==4) {
								System.out.println("Uma nota de R$5 e quatro notas de R$1");
							}else if(n1 ==0) {
								System.out.println("Uma nota de R$5");
							}
						}
					}else if(n10 ==1) {
						if (n5 == 0) {
							if(n1 == 1) {
								System.out.println("Uma nota de R$10 e uma nota de R$1");
							}else if(n1==2) {
								System.out.println("Uma nota de R$10 e duas notas de R$1");
							}else if(n1==3) {
								System.out.println("Uma nota de R$10 e tres notas de R$1"); 
							}else if(n1 ==4) {
								System.out.println("Uma nota de R$10 e quatro notas de R$1");
							}else if(n1 == 0) {
								System.out.println("Uma nota de 10");
							}
						}else if(n5 >= 1) {
							if(n1 == 1) {
								System.out.println("Uma nota de R$10, uma nota de R$5 e uma nota de R$1");
							}else if(n1==2) {
								System.out.println("Uma nota de R$10, uma nota de R$5 e duas notas de R$1");
							}else if(n1==3) {
								System.out.println("Uma nota de R$10, uma nota de R$5 e tres notas de R$1"); 
							}else if(n1 ==4) {
								System.out.println("Uma nota de R$10, uma nota de R$5 e quatro notas de R$1");
							}else if(n1== 0) {
								System.out.println("Uma nota de R$10 e uma nota de R$5");
							}
						}
						
					}else if(n10 == 2) {
						if (n5 == 0) {
							if(n1 == 1) {
								System.out.println("Duas notas de R$10 e uma nota de R$1");
							}else if(n1==2) {
								System.out.println("Duas notas de R$10 e duas notas de R$1");
							}else if(n1==3) {
								System.out.println("Duas notas de R$10 e tres notas de R$1"); 
							}else if(n1 ==4) {
								System.out.println("Duas notas de R$10 e quatro notas de R$1");
							}else if(n1 == 0) {
								System.out.println("Duas notas de 10");
							}
						}else if(n5 >= 1) {
							if(n1 == 1) {
								System.out.println("Duas notas de R$10, uma nota de R$5 e uma nota de R$1");
							}else if(n1==2) {
								System.out.println("Duas notas de R$10, uma nota de R$5 e duas notas de R$1");
							}else if(n1==3) {
								System.out.println("Duas notas de R$10, uma nota de R$5 e tres notas de R$1"); 
							}else if(n1 ==4) {
								System.out.println("Duas notas de R$10, uma nota de R$5 e quatro notas de R$1");
							}else if(n1== 0) {
								System.out.println("Duas notas de R$10 e uma nota de R$5");
							}
						}
						
					}else if(n10 ==3) {
						if (n5 == 0) {
							if(n1 == 1) {
								System.out.println("Tres notas de R$10 e uma nota de R$1");
							}else if(n1==2) {
								System.out.println("Tres notas de R$10 e duas notas de R$1");
							}else if(n1==3) {
								System.out.println("Tres notas de R$10 e tres notas de R$1"); 
							}else if(n1 ==4) {
								System.out.println("Tres notas de R$10 e quatro notas de R$1");
							}else if(n1 == 0) {
								System.out.println("Tres notas de 10");
							}
						}else if(n5 >= 1) {
							if(n1 == 1) {
								System.out.println("Tres notas de R$10, uma nota de R$5 e uma nota de R$1");
							}else if(n1==2) {
								System.out.println("Tres notas de R$10, uma nota de R$5 e duas notas de R$1");
							}else if(n1==3) {
								System.out.println("Tres notas de R$10, uma nota de R$5 e tres notas de R$1"); 
							}else if(n1 ==4) {
								System.out.println("Tres notas de R$10, uma nota de R$5 e quatro notas de R$1");
							}else if(n1== 0) {
								System.out.println("Tres notas de R$10 e uma nota de R$5");
							}
						}
					}else if(n10 == 4) {
						if (n5 == 0) {
							if(n1 == 1) {
								System.out.println("Quatro notas de R$10 e uma nota de R$1");
							}else if(n1==2) {
								System.out.println("Quatro notas de R$10 e duas notas de R$1");
							}else if(n1==3) {
								System.out.println("Quatro notas de R$10 e tres notas de R$1"); 
							}else if(n1 ==4) {
								System.out.println("Quatro notas de R$10 e quatro notas de R$1");
							}else if(n1 == 0) {
								System.out.println("Quatro notas de 10");
							}
						}else if(n5 >= 1) {
							if(n1 == 1) {
								System.out.println("Quatro notas de R$10, uma nota de R$5 e uma nota de R$1");
							}else if(n1==2) {
								System.out.println("Quatro notas de R$10, uma nota de R$5 e duas notas de R$1");
							}else if(n1==3) {
								System.out.println("Quatro notas de R$10, uma nota de R$5 e tres notas de R$1"); 
							}else if(n1 ==4) {
								System.out.println("Quatro notas de R$10, uma nota de R$5 e quatro notas de R$1");
							}else if(n1== 0) {
								System.out.println("Quatro notas de R$10 e uma nota de R$5");
							}
						}
					}
					
				}else if(n50 >=1) {
					if(n10 ==0) {
						if (n5 == 0) {
							if(n1 == 1) {
								System.out.println("Uma nota de R$50 e uma nota de R$1");
							}else if(n1==2) {
								System.out.println("Uma nota de R$50 e duas notas de R$1");
							}else if(n1==3) {
								System.out.println("Uma nota de R$50 e tres notas de R$1"); 
							}else if(n1 ==4) {
								System.out.println("Uma nota de R$50 e quatro notas de R$1");
							}else if(n1==0) {
								System.out.println("Uma nota de R$50");
							}
						}else if(n5 >= 1) {
							if(n1 == 1) {
								System.out.println("Uma nota de R$50, uma nota de R$5 e uma nota de R$1");
							}else if(n1==2) {
								System.out.println("Uma nota de R$50, uma nota de R$5 e duas notas de R$1");
							}else if(n1==3) {
								System.out.println("Uma nota de R$50, uma nota de R$5 e tres notas de R$1"); 
							}else if(n1 ==4) {
								System.out.println("Uma nota de R$50, uma nota de R$5 e quatro notas de R$1");
							}else if(n1 ==0) {
								System.out.println("Uma nota de R$50 e uma nota de R$5");
							}
						}
					}else if(n10 ==1) {
						if (n5 == 0) {
							if(n1 == 1) {
								System.out.println("Uma nota de R$50, uma nota de R$10 e uma nota de R$1");
							}else if(n1==2) {
								System.out.println("Uma nota de R$50, uma nota de R$10 e duas notas de R$1");
							}else if(n1==3) {
								System.out.println("Uma nota de R$50, uma nota de R$10 e tres notas de R$1"); 
							}else if(n1 ==4) {
								System.out.println("Uma nota de R$50, uma nota de R$10 e quatro notas de R$1");
							}else if(n1 == 0) {
								System.out.println("Uma nota de R$50 e uma nota de 10");
							}
						}else if(n5 >= 1) {
							if(n1 == 1) {
								System.out.println("Uma nota de R$50, uma nota de R$10, uma nota de R$5 e uma nota de R$1");
							}else if(n1==2) {
								System.out.println("Uma nota de R$50, uma nota de R$10, uma nota de R$5 e duas notas de R$1");
							}else if(n1==3) {
								System.out.println("Uma nota de R$50, uma nota de R$10, uma nota de R$5 e tres notas de R$1"); 
							}else if(n1 ==4) {
								System.out.println("Uma nota de R$50, uma nota de R$10, uma nota de R$5 e quatro notas de R$1");
							}else if(n1== 0) {
								System.out.println("Uma nota de R$50, uma nota de R$10 e uma nota de R$5");
							}
						}
						
					}else if(n10 == 2) {
						if (n5 == 0) {
							if(n1 == 1) {
								System.out.println("Uma nota de R$50, duas notas de R$10 e uma nota de R$1");
							}else if(n1==2) {
								System.out.println("Uma nota de R$50, duas notas de R$10 e duas notas de R$1");
							}else if(n1==3) {
								System.out.println("Uma nota de R$50, duas notas de R$10 e tres notas de R$1"); 
							}else if(n1 ==4) {
								System.out.println("Uma nota de R$50, duas notas de R$10 e quatro notas de R$1");
							}else if(n1 == 0) {
								System.out.println("Uma nota de R$50 e Duas notas de 10");
							}
						}else if(n5 >= 1) {
							if(n1 == 1) {
								System.out.println("Uma nota de R$50, duas notas de R$10, uma nota de R$5 e uma nota de R$1");
							}else if(n1==2) {
								System.out.println("Uma nota de R$50, duas notas de R$10, uma nota de R$5 e duas notas de R$1");
							}else if(n1==3) {
								System.out.println("Uma nota de R$50, duas notas de R$10, uma nota de R$5 e tres notas de R$1"); 
							}else if(n1 ==4) {
								System.out.println("Uma nota de R$50, duas notas de R$10, uma nota de R$5 e quatro notas de R$1");
							}else if(n1== 0) {
								System.out.println("Uma nota de R$50, duas notas de R$10 e uma nota de R$5");
							}
						}
						
					}else if(n10 ==3) {
						if (n5 == 0) {
							if(n1 == 1) {
								System.out.println("Uma nota de R$50, tres notas de R$10 e uma nota de R$1");
							}else if(n1==2) {
								System.out.println("Uma nota de R$50, tres notas de R$10 e duas notas de R$1");
							}else if(n1==3) {
								System.out.println("Uma nota de R$50, tres notas de R$10 e tres notas de R$1"); 
							}else if(n1 ==4) {
								System.out.println("Uma nota de R$50, tres notas de R$10 e quatro notas de R$1");
							}else if(n1 == 0) {
								System.out.println("Uma nota de R$50, tres notas de 10");
							}
						}else if(n5 >= 1) {
							if(n1 == 1) {
								System.out.println("Uma nota de R$50, tres notas de R$10, uma nota de R$5 e uma nota de R$1");
							}else if(n1==2) {
								System.out.println("Uma nota de R$50, tres notas de R$10, uma nota de R$5 e duas notas de R$1");
							}else if(n1==3) {
								System.out.println("Uma nota de R$50, tres notas de R$10, uma nota de R$5 e tres notas de R$1"); 
							}else if(n1 ==4) {
								System.out.println("Uma nota de R$50, tres notas de R$10, uma nota de R$5 e quatro notas de R$1");
							}else if(n1== 0) {
								System.out.println("Uma nota de R$50, tres notas de R$10 e uma nota de R$5");
							}
						}
					}else if(n10 == 4) {
						if (n5 == 0) {
							if(n1 == 1) {
								System.out.println("Uma nota de R$50, quatro notas de R$10 e uma nota de R$1");
							}else if(n1==2) {
								System.out.println("Uma nota de R$50, quatro notas de R$10 e duas notas de R$1");
							}else if(n1==3) {
								System.out.println("Uma nota de R$50, quatro notas de R$10 e tres notas de R$1"); 
							}else if(n1 ==4) {
								System.out.println("Uma nota de R$50, quatro notas de R$10 e quatro notas de R$1");
							}else if(n1 == 0) {
								System.out.println("Uma nota de R$50 e quatro notas de 10");
							}
						}else if(n5 >= 1) {
							if(n1 == 1) {
								System.out.println("Uma nota de R$50, quatro notas de R$10, uma nota de R$5 e uma nota de R$1");
							}else if(n1==2) {
								System.out.println("Uma nota de R$50, quatro notas de R$10, uma nota de R$5 e duas notas de R$1");
							}else if(n1==3) {
								System.out.println("Uma nota de R$50, quatro notas de R$10, uma nota de R$5 e tres notas de R$1"); 
							}else if(n1 ==4) {
								System.out.println("Uma nota de R$50, quatro notas de R$10, uma nota de R$5 e quatro notas de R$1");
							}else if(n1== 0) {
								System.out.println("Uma nota de R$50, quatro notas de R$10 e uma nota de R$5");
							}
						}
					}
						
					}
					
				}else if(n100 ==1) {
					if(n50 == 0) {
						if(n10 ==0) {
							if (n5 == 0) {
								if(n1 == 1) {
									System.out.println("Uma nota de R$100 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("Uma nota de R$100 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("Uma nota de R$100 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("Uma nota de R$100 e quatro notas de R$1");
								}else if(n1==0) {
									System.out.println("Uma nota de R$100");
								}
							}else if(n5 >= 1) {
								if(n1 == 1) {
									System.out.println("Uma nota de R$100, uma nota de R$5 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("Uma nota de R$100, uma nota de R$5 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("Uma nota de R$100, uma nota de R$5 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("Uma nota de R$100, uma nota de R$5 e quatro notas de R$1");
								}else if(n1 ==0) {
									System.out.println("Uma nota de R$100, uma nota de R$5");
								}
							}
						}else if(n10 ==1) {
							if (n5 == 0) {
								if(n1 == 1) {
									System.out.println("Uma nota de R$100, uma nota de R$10 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("Uma nota de R$100, uma nota de R$10 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("Uma nota de R$100, uma nota de R$10 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("Uma nota de R$100, uma nota de R$10 e quatro notas de R$1");
								}else if(n1 == 0) {
									System.out.println("Uma nota de R$100 e uma nota de 10");
								}
							}else if(n5 >= 1) {
								if(n1 == 1) {
									System.out.println("Uma nota de R$100, uma nota de R$10, uma nota de R$5 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("Uma nota de R$100, uma nota de R$10, uma nota de R$5 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("Uma nota de R$100, uma nota de R$10, uma nota de R$5 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("Uma nota de R$100, uma nota de R$10, uma nota de R$5 e quatro notas de R$1");
								}else if(n1== 0) {
									System.out.println("Uma nota de R$100, uma nota de R$10 e uma nota de R$5");
								}
							}
							
						}else if(n10 == 2) {
							if (n5 == 0) {
								if(n1 == 1) {
									System.out.println("Uma nota de R$100, duas notas de R$10 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("Uma nota de R$100, duas notas de R$10 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("Uma nota de R$100, duas notas de R$10 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("Uma nota de R$100, duas notas de R$10 e quatro notas de R$1");
								}else if(n1 == 0) {
									System.out.println("Uma nota de R$100 e duas notas de 10");
								}
							}else if(n5 >= 1) {
								if(n1 == 1) {
									System.out.println("Uma nota de R$100, duas notas de R$10, uma nota de R$5 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("Uma nota de R$100, duas notas de R$10, uma nota de R$5 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("Uma nota de R$100, duas notas de R$10, uma nota de R$5 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("Uma nota de R$100, duas notas de R$10, uma nota de R$5 e quatro notas de R$1");
								}else if(n1== 0) {
									System.out.println("Uma nota de R$100, duas notas de R$10 e uma nota de R$5");
								}
							}
							
						}else if(n10 ==3) {
							if (n5 == 0) {
								if(n1 == 1) {
									System.out.println("Uma nota de R$100, tres notas de R$10 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("Uma nota de R$100, tres notas de R$10 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("Uma nota de R$100, tres notas de R$10 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("Uma nota de R$100, tres notas de R$10 e quatro notas de R$1");
								}else if(n1 == 0) {
									System.out.println("Uma nota de R$100 e tres notas de 10");
								}
							}else if(n5 >= 1) {
								if(n1 == 1) {
									System.out.println("Uma nota de R$100, tres notas de R$10, uma nota de R$5 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("Uma nota de R$100, tres notas de R$10, uma nota de R$5 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("Uma nota de R$100, tres notas de R$10, uma nota de R$5 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("Uma nota de R$100, tres notas de R$10, uma nota de R$5 e quatro notas de R$1");
								}else if(n1== 0) {
									System.out.println("Uma nota de R$100, tres notas de R$10 e uma nota de R$5");
								}
							}
						}else if(n10 == 4) {
							if (n5 == 0) {
								if(n1 == 1) {
									System.out.println("Uma nota de R$100, quatro notas de R$10 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("Uma nota de R$100, quatro notas de R$10 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("Uma nota de R$100, quatro notas de R$10 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("Uma nota de R$100, quatro notas de R$10 e quatro notas de R$1");
								}else if(n1 == 0) {
									System.out.println("Uma nota de R$100 e quatro notas de 10");
								}
							}else if(n5 >= 1) {
								if(n1 == 1) {
									System.out.println("Uma nota de R$100, quatro notas de R$10, uma nota de R$5 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("Uma nota de R$100, quatro notas de R$10, uma nota de R$5 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("Uma nota de R$100, quatro notas de R$10, uma nota de R$5 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("Uma nota de R$100, quatro notas de R$10, uma nota de R$5 e quatro notas de R$1");
								}else if(n1== 0) {
									System.out.println("Uma nota de R$100, quatro notas de R$10 e uma nota de R$5");
								}
							}
						}
						
					}else if(n50 >=1) {
						if(n10 ==0) {
							if (n5 == 0) {
								if(n1 == 1) {
									System.out.println("Uma nota de R$100, uma nota de R$50 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("Uma nota de R$100, uma nota de R$50 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("Uma nota de R$100, uma nota de R$50 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("Uma nota de R$100, uma nota de R$50 e quatro notas de R$1");
								}
							}else if(n5 >= 1) {
								if(n1 == 1) {
									System.out.println("Uma nota de R$100, uma nota de R$50, uma nota de R$5 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("Uma nota de R$100, uma nota de R$50, uma nota de R$5 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("Uma nota de R$100, uma nota de R$50, uma nota de R$5 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("Uma nota de R$100, uma nota de R$50, uma nota de R$5 e quatro notas de R$1");
								}else if(n1 ==0) {
									System.out.println("Uma nota de R$100, uma nota de R$50 e uma nota de R$5");
								}
							}
						}else if(n10 ==1) {
							if (n5 == 0) {
								if(n1 == 1) {
									System.out.println("Uma nota de R$100, uma nota de R$50, uma nota de R$10 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("Uma nota de R$100, uma nota de R$50, uma nota de R$10 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("Uma nota de R$100, uma nota de R$50, uma nota de R$10 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("Uma nota de R$100, uma nota de R$50, uma nota de R$10 e quatro notas de R$1");
								}else if(n1 == 0) {
									System.out.println("Uma nota de R$100, uma nota de R$50 e uma nota de 10");
								}
							}else if(n5 >= 1) {
								if(n1 == 1) {
									System.out.println("Uma nota de R$100, uma nota de R$50, uma nota de R$10, uma nota de R$5 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("Uma nota de R$100, uma nota de R$50, uma nota de R$10, uma nota de R$5 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("Uma nota de R$100, uma nota de R$50, uma nota de R$10, uma nota de R$5 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("Uma nota de R$100, uma nota de R$50, uma nota de R$10, uma nota de R$5 e quatro notas de R$1");
								}else if(n1== 0) {
									System.out.println("Uma nota de R$100, uma nota de R$50, uma nota de R$10 e uma nota de R$5");
								}
							}
							
						}else if(n10 == 2) {
							if (n5 == 0) {
								if(n1 == 1) {
									System.out.println("Uma nota de R$100, uma nota de R$50, duas notas de R$10 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("Uma nota de R$100, uma nota de R$50, duas notas de R$10 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("Uma nota de R$100, uma nota de R$50, duas notas de R$10 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("Uma nota de R$100, uma nota de R$50, duas notas de R$10 e quatro notas de R$1");
								}else if(n1 == 0) {
									System.out.println("Uma nota de R$100, uma nota de R$50 e Duas notas de 10");
								}
							}else if(n5 >= 1) {
								if(n1 == 1) {
									System.out.println("Uma nota de R$100, uma nota de R$50, duas notas de R$10, uma nota de R$5 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("Uma nota de R$100, uma nota de R$50, duas notas de R$10, uma nota de R$5 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("Uma nota de R$100, uma nota de R$50, duas notas de R$10, uma nota de R$5 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("Uma nota de R$100, uma nota de R$50, duas notas de R$10, uma nota de R$5 e quatro notas de R$1");
								}else if(n1== 0) {
									System.out.println("Uma nota de R$100, uma nota de R$50, duas notas de R$10 e uma nota de R$5");
								}
							}
							
						}else if(n10 ==3) {
							if (n5 == 0) {
								if(n1 == 1) {
									System.out.println("Uma nota de R$100, uma nota de R$50, tres notas de R$10 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("Uma nota de R$100, uma nota de R$50, tres notas de R$10 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("Uma nota de R$100, uma nota de R$50, tres notas de R$10 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("Uma nota de R$100, uma nota de R$50, tres notas de R$10 e quatro notas de R$1");
								}else if(n1 == 0) {
									System.out.println("Uma nota de R$100, uma nota de R$50, tres notas de 10");
								}
							}else if(n5 >= 1) {
								if(n1 == 1) {
									System.out.println("Uma nota de R$100, uma nota de R$50, tres notas de R$10, uma nota de R$5 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("Uma nota de R$100, uma nota de R$50, tres notas de R$10, uma nota de R$5 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("Uma nota de R$100, uma nota de R$50, tres notas de R$10, uma nota de R$5 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("Uma nota de R$100, uma nota de R$50, tres notas de R$10, uma nota de R$5 e quatro notas de R$1");
								}else if(n1== 0) {
									System.out.println("Uma nota de R$100, uma nota de R$50, tres notas de R$10 e uma nota de R$5");
								}
							}
						}else if(n10 == 4) {
							if (n5 == 0) {
								if(n1 == 1) {
									System.out.println("Uma nota de R$100, uma nota de R$50, quatro notas de R$10 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("Uma nota de R$100, uma nota de R$50, quatro notas de R$10 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("Uma nota de R$100, uma nota de R$50, quatro notas de R$10 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("Uma nota de R$100, uma nota de R$50, quatro notas de R$10 e quatro notas de R$1");
								}else if(n1 == 0) {
									System.out.println("Uma nota de R$100, uma nota de R$50 e quatro notas de 10");
								}
							}else if(n5 >= 1) {
								if(n1 == 1) {
									System.out.println("Uma nota de R$100, uma nota de R$50, quatro notas de R$10, uma nota de R$5 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("Uma nota de R$100, uma nota de R$50, quatro notas de R$10, uma nota de R$5 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("Uma nota de R$100, uma nota de R$50, quatro notas de R$10, uma nota de R$5 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("Uma nota de R$100, uma nota de R$50, quatro notas de R$10, uma nota de R$5 e quatro notas de R$1");
								}else if(n1== 0) {
									System.out.println("Uma nota de R$100, uma nota de R$50, quatro notas de R$10 e uma nota de R$5");
								}
							}
						}
							
						}
					
				}else if(n100 ==2) {
					if(n50 == 0) {
						if(n10 ==0) {
							if (n5 == 0) {
								if(n1 == 1) {
									System.out.println("Duas notas de R$100 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("Duas notas de R$100 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("Duas notas de R$100 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("Duas notas de R$100 e quatro notas de R$1");
								}else if(n1==0) {
									System.out.println("Duas notas de R$100");
								}
							}else if(n5 >= 1) {
								if(n1 == 1) {
									System.out.println("Duas notas de R$100, uma nota de R$5 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("Duas notas de R$100, uma nota de R$5 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("Duas notas de R$100, uma nota de R$5 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("Duas notas de R$100, uma nota de R$5 e quatro notas de R$1");
								}else if(n1 ==0) {
									System.out.println("Duas notas de R$100, uma nota de R$5");
								}
							}
						}else if(n10 ==1) {
							if (n5 == 0) {
								if(n1 == 1) {
									System.out.println("Duas notas de R$100, uma nota de R$10 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("Duas notas de R$100, uma nota de R$10 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("Duas notas de R$100, uma nota de R$10 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("Duas notas de R$100, uma nota de R$10 e quatro notas de R$1");
								}else if(n1 == 0) {
									System.out.println("Duas notas de R$100 e uma nota de 10");
								}
							}else if(n5 >= 1) {
								if(n1 == 1) {
									System.out.println("Duas notas de R$100, uma nota de R$10, uma nota de R$5 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("Duas notas de R$100, uma nota de R$10, uma nota de R$5 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("Duas notas de R$100, uma nota de R$10, uma nota de R$5 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("Duas notas de R$100, uma nota de R$10, uma nota de R$5 e quatro notas de R$1");
								}else if(n1== 0) {
									System.out.println("Duas notas de R$100, uma nota de R$10 e uma nota de R$5");
								}
							}
							
						}else if(n10 == 2) {
							if (n5 == 0) {
								if(n1 == 1) {
									System.out.println("Duas notas de R$100, duas notas de R$10 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("Duas notas de R$100, duas notas de R$10 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("Duas notas de R$100, duas notas de R$10 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("Duas notas de R$100, duas notas de R$10 e quatro notas de R$1");
								}else if(n1 == 0) {
									System.out.println("Duas notas de R$100 e duas notas de 10");
								}
							}else if(n5 >= 1) {
								if(n1 == 1) {
									System.out.println("Duas notas de R$100, duas notas de R$10, uma nota de R$5 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("Duas notas de R$100, duas notas de R$10, uma nota de R$5 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("Duas notas de R$100, duas notas de R$10, uma nota de R$5 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("Duas notas de R$100, duas notas de R$10, uma nota de R$5 e quatro notas de R$1");
								}else if(n1== 0) {
									System.out.println("Duas notas de R$100, duas notas de R$10 e uma nota de R$5");
								}
							}
							
						}else if(n10 ==3) {
							if (n5 == 0) {
								if(n1 == 1) {
									System.out.println("Duas notas de R$100, tres notas de R$10 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("Duas notas de R$100, tres notas de R$10 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("Duas notas de R$100, tres notas de R$10 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("Duas notas de R$100, tres notas de R$10 e quatro notas de R$1");
								}else if(n1 == 0) {
									System.out.println("Duas notas de R$100 e tres notas de 10");
								}
							}else if(n5 >= 1) {
								if(n1 == 1) {
									System.out.println("Duas notas de R$100, tres notas de R$10, uma nota de R$5 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("Duas notas de R$100, tres notas de R$10, uma nota de R$5 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("Duas notas de R$100, tres notas de R$10, uma nota de R$5 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("Duas notas de R$100, tres notas de R$10, uma nota de R$5 e quatro notas de R$1");
								}else if(n1== 0) {
									System.out.println("Duas notas de R$100, tres notas de R$10 e uma nota de R$5");
								}
							}
						}else if(n10 == 4) {
							if (n5 == 0) {
								if(n1 == 1) {
									System.out.println("Duas notas de R$100, quatro notas de R$10 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("Duas notas de R$100, quatro notas de R$10 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("Duas notas de R$100, quatro notas de R$10 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("Duas notas de R$100, quatro notas de R$10 e quatro notas de R$1");
								}else if(n1 == 0) {
									System.out.println("Duas notas de R$100 e quatro notas de 10");
								}
							}else if(n5 >= 1) {
								if(n1 == 1) {
									System.out.println("Duas notas de R$100, quatro notas de R$10, uma nota de R$5 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("Duas notas de R$100, quatro notas de R$10, uma nota de R$5 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("Duas notas de R$100, quatro notas de R$10, uma nota de R$5 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("Duas notas de R$100, quatro notas de R$10, uma nota de R$5 e quatro notas de R$1");
								}else if(n1== 0) {
									System.out.println("Duas notas de R$100, quatro notas de R$10 e uma nota de R$5");
								}
							}
						}
						
					}else if(n50 >=1) {
						if(n10 ==0) {
							if (n5 == 0) {
								if(n1 == 1) {
									System.out.println("Duas notas de R$100, uma nota de R$50 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("Duas notas de R$100, uma nota de R$50 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("Duas notas de R$100, uma nota de R$50 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("Duas notas de R$100, uma nota de R$50 e quatro notas de R$1");
								}
							}else if(n5 >= 1) {
								if(n1 == 1) {
									System.out.println("Duas notas de R$100, uma nota de R$50, uma nota de R$5 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("Duas notas de R$100, uma nota de R$50, uma nota de R$5 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("Duas notas de R$100, uma nota de R$50, uma nota de R$5 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("Duas notas de R$100, uma nota de R$50, uma nota de R$5 e quatro notas de R$1");
								}else if(n1 ==0) {
									System.out.println("Duas notas de R$100, uma nota de R$50 e uma nota de R$5");
								}
							}
						}else if(n10 ==1) {
							if (n5 == 0) {
								if(n1 == 1) {
									System.out.println("Duas notas de R$100, uma nota de R$50, uma nota de R$10 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("Duas notas de R$100, uma nota de R$50, uma nota de R$10 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("Duas notas de R$100, uma nota de R$50, uma nota de R$10 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("Duas notas de R$100, uma nota de R$50, uma nota de R$10 e quatro notas de R$1");
								}else if(n1 == 0) {
									System.out.println("Duas notas de R$100, uma nota de R$50 e uma nota de 10");
								}
							}else if(n5 >= 1) {
								if(n1 == 1) {
									System.out.println("Duas notas de R$100, uma nota de R$50, uma nota de R$10, uma nota de R$5 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("Duas notas de R$100, uma nota de R$50, uma nota de R$10, uma nota de R$5 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("Duas notas de R$100, uma nota de R$50, uma nota de R$10, uma nota de R$5 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("Duas notas de R$100, uma nota de R$50, uma nota de R$10, uma nota de R$5 e quatro notas de R$1");
								}else if(n1== 0) {
									System.out.println("Duas notas de R$100, uma nota de R$50, uma nota de R$10 e uma nota de R$5");
								}
							}
							
						}else if(n10 == 2) {
							if (n5 == 0) {
								if(n1 == 1) {
									System.out.println("Duas notas de R$100, uma nota de R$50, duas notas de R$10 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("Duas notas de R$100, uma nota de R$50, duas notas de R$10 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("Duas notas de R$100, uma nota de R$50, duas notas de R$10 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("Duas notas de R$100, uma nota de R$50, duas notas de R$10 e quatro notas de R$1");
								}else if(n1 == 0) {
									System.out.println("Duas notas de R$100, uma nota de R$50 e Duas notas de 10");
								}
							}else if(n5 >= 1) {
								if(n1 == 1) {
									System.out.println("Duas notas de R$100, uma nota de R$50, duas notas de R$10, uma nota de R$5 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("Duas notas de R$100, uma nota de R$50, duas notas de R$10, uma nota de R$5 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("Duas notas de R$100, uma nota de R$50, duas notas de R$10, uma nota de R$5 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("Duas notas de R$100, uma nota de R$50, duas notas de R$10, uma nota de R$5 e quatro notas de R$1");
								}else if(n1== 0) {
									System.out.println("Duas notas de R$100, uma nota de R$50, duas notas de R$10 e uma nota de R$5");
								}
							}
							
						}else if(n10 ==3) {
							if (n5 == 0) {
								if(n1 == 1) {
									System.out.println("Duas notas de R$100, uma nota de R$50, tres notas de R$10 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("Duas notas de R$100, uma nota de R$50, tres notas de R$10 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("Duas notas de R$100, uma nota de R$50, tres notas de R$10 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("Duas notas de R$100, uma nota de R$50, tres notas de R$10 e quatro notas de R$1");
								}else if(n1 == 0) {
									System.out.println("Duas notas de R$100, uma nota de R$50, tres notas de 10");
								}
							}else if(n5 >= 1) {
								if(n1 == 1) {
									System.out.println("Duas notas de R$100, uma nota de R$50, tres notas de R$10, uma nota de R$5 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("Duas notas de R$100, uma nota de R$50, tres notas de R$10, uma nota de R$5 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("Duas notas de R$100, uma nota de R$50, tres notas de R$10, uma nota de R$5 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("Duas notas de R$100, uma nota de R$50, tres notas de R$10, uma nota de R$5 e quatro notas de R$1");
								}else if(n1== 0) {
									System.out.println("Duas notas de R$100, uma nota de R$50, tres notas de R$10 e uma nota de R$5");
								}
							}
						}else if(n10 == 4) {
							if (n5 == 0) {
								if(n1 == 1) {
									System.out.println("Duas notas de R$100, uma nota de R$50, quatro notas de R$10 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("Duas notas de R$100, uma nota de R$50, quatro notas de R$10 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("Duas notas de R$100, uma nota de R$50, quatro notas de R$10 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("Duas notas de R$100, uma nota de R$50, quatro notas de R$10 e quatro notas de R$1");
								}else if(n1 == 0) {
									System.out.println("Duas notas de R$100, uma nota de R$50 e quatro notas de 10");
								}
							}else if(n5 >= 1) {
								if(n1 == 1) {
									System.out.println("Duas notas de R$100, uma nota de R$50, quatro notas de R$10, uma nota de R$5 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("Duas notas de R$100, uma nota de R$50, quatro notas de R$10, uma nota de R$5 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("Duas notas de R$100, uma nota de R$50, quatro notas de R$10, uma nota de R$5 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("Duas notas de R$100, uma nota de R$50, quatro notas de R$10, uma nota de R$5 e quatro notas de R$1");
								}else if(n1== 0) {
									System.out.println("Duas notas de R$100, uma nota de R$50, quatro notas de R$10 e uma nota de R$5");
								}
							}
						}
							
						}
				}else if(n100==3) {
					if(n50 == 0) {
						if(n10 ==0) {
							if (n5 == 0) {
								if(n1 == 1) {
									System.out.println("3 notas de R$100 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("3 notas de R$100 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("3 notas de R$100 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("3 notas de R$100 e quatro notas de R$1");
								}else if(n1==0) {
									System.out.println("3 notas de R$100");
								}
							}else if(n5 >= 1) {
								if(n1 == 1) {
									System.out.println("3 notas de R$100, uma nota de R$5 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("3 notas de R$100, uma nota de R$5 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("3 notas de R$100, uma nota de R$5 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("3 notas de R$100, uma nota de R$5 e quatro notas de R$1");
								}else if(n1 ==0) {
									System.out.println("Duas notas de R$100, uma nota de R$5");
								}
							}
						}else if(n10 ==1) {
							if (n5 == 0) {
								if(n1 == 1) {
									System.out.println("3 notas de R$100, uma nota de R$10 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("3 notas de R$100, uma nota de R$10 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("3 notas de R$100, uma nota de R$10 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("3 notas de R$100, uma nota de R$10 e quatro notas de R$1");
								}else if(n1 == 0) {
									System.out.println("3 notas de R$100 e uma nota de 10");
								}
							}else if(n5 >= 1) {
								if(n1 == 1) {
									System.out.println("3 notas de R$100, uma nota de R$10, uma nota de R$5 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("3 notas de R$100, uma nota de R$10, uma nota de R$5 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("3 notas de R$100, uma nota de R$10, uma nota de R$5 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("3 notas de R$100, uma nota de R$10, uma nota de R$5 e quatro notas de R$1");
								}else if(n1== 0) {
									System.out.println("3 notas de R$100, uma nota de R$10 e uma nota de R$5");
								}
							}
							
						}else if(n10 == 2) {
							if (n5 == 0) {
								if(n1 == 1) {
									System.out.println("3 notas de R$100, duas notas de R$10 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("3 notas de R$100, duas notas de R$10 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("3 notas de R$100, duas notas de R$10 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("3 notas de R$100, duas notas de R$10 e quatro notas de R$1");
								}else if(n1 == 0) {
									System.out.println("3 notas de R$100 e duas notas de 10");
								}
							}else if(n5 >= 1) {
								if(n1 == 1) {
									System.out.println("3 notas de R$100, duas notas de R$10, uma nota de R$5 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("3 notas de R$100, duas notas de R$10, uma nota de R$5 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("3 notas de R$100, duas notas de R$10, uma nota de R$5 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("3 notas de R$100, duas notas de R$10, uma nota de R$5 e quatro notas de R$1");
								}else if(n1== 0) {
									System.out.println("3 notas de R$100, duas notas de R$10 e uma nota de R$5");
								}
							}
							
						}else if(n10 ==3) {
							if (n5 == 0) {
								if(n1 == 1) {
									System.out.println("3 notas de R$100, tres notas de R$10 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("3 notas de R$100, tres notas de R$10 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("3 notas de R$100, tres notas de R$10 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("3 notas de R$100, tres notas de R$10 e quatro notas de R$1");
								}else if(n1 == 0) {
									System.out.println("3 notas de R$100 e tres notas de 10");
								}
							}else if(n5 >= 1) {
								if(n1 == 1) {
									System.out.println("3 notas de R$100, tres notas de R$10, uma nota de R$5 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("3 notas de R$100, tres notas de R$10, uma nota de R$5 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("3 notas de R$100, tres notas de R$10, uma nota de R$5 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("3 notas de R$100, tres notas de R$10, uma nota de R$5 e quatro notas de R$1");
								}else if(n1== 0) {
									System.out.println("3 notas de R$100, tres notas de R$10 e uma nota de R$5");
								}
							}
						}else if(n10 == 4) {
							if (n5 == 0) {
								if(n1 == 1) {
									System.out.println("3 notas de R$100, quatro notas de R$10 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("3 notas de R$100, quatro notas de R$10 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("3 notas de R$100, quatro notas de R$10 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("3 notas de R$100, quatro notas de R$10 e quatro notas de R$1");
								}else if(n1 == 0) {
									System.out.println("3 notas de R$100 e quatro notas de 10");
								}
							}else if(n5 >= 1) {
								if(n1 == 1) {
									System.out.println("3 notas de R$100, quatro notas de R$10, uma nota de R$5 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("3 notas de R$100, quatro notas de R$10, uma nota de R$5 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("3 notas de R$100, quatro notas de R$10, uma nota de R$5 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("3 notas de R$100, quatro notas de R$10, uma nota de R$5 e quatro notas de R$1");
								}else if(n1== 0) {
									System.out.println("3 notas de R$100, quatro notas de R$10 e uma nota de R$5");
								}
							}
						}
						
					}else if(n50 >=1) {
						if(n10 ==0) {
							if (n5 == 0) {
								if(n1 == 1) {
									System.out.println("3 notas de R$100, uma nota de R$50 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("3 notas de R$100, uma nota de R$50 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("3 notas de R$100, uma nota de R$50 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("3 notas de R$100, uma nota de R$50 e quatro notas de R$1");
								}
							}else if(n5 >= 1) {
								if(n1 == 1) {
									System.out.println("3 notas de R$100, uma nota de R$50, uma nota de R$5 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("3 notas de R$100, uma nota de R$50, uma nota de R$5 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("3 notas de R$100, uma nota de R$50, uma nota de R$5 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("3 notas de R$100, uma nota de R$50, uma nota de R$5 e quatro notas de R$1");
								}else if(n1 ==0) {
									System.out.println("3 notas de R$100, uma nota de R$50 e uma nota de R$5");
								}
							}
						}else if(n10 ==1) {
							if (n5 == 0) {
								if(n1 == 1) {
									System.out.println("3 notas de R$100, uma nota de R$50, uma nota de R$10 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("3 notas de R$100, uma nota de R$50, uma nota de R$10 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("3 notas de R$100, uma nota de R$50, uma nota de R$10 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("3 notas de R$100, uma nota de R$50, uma nota de R$10 e quatro notas de R$1");
								}else if(n1 == 0) {
									System.out.println("3 notas de R$100, uma nota de R$50 e uma nota de 10");
								}
							}else if(n5 >= 1) {
								if(n1 == 1) {
									System.out.println("3 notas de R$100, uma nota de R$50, uma nota de R$10, uma nota de R$5 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("3 notas de R$100, uma nota de R$50, uma nota de R$10, uma nota de R$5 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("3 notas de R$100, uma nota de R$50, uma nota de R$10, uma nota de R$5 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("3 notas de R$100, uma nota de R$50, uma nota de R$10, uma nota de R$5 e quatro notas de R$1");
								}else if(n1== 0) {
									System.out.println("3 notas de R$100, uma nota de R$50, uma nota de R$10 e uma nota de R$5");
								}
							}
							
						}else if(n10 == 2) {
							if (n5 == 0) {
								if(n1 == 1) {
									System.out.println("3 notas de R$100, uma nota de R$50, duas notas de R$10 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("3 notas de R$100, uma nota de R$50, duas notas de R$10 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("3 notas de R$100, uma nota de R$50, duas notas de R$10 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("3 notas de R$100, uma nota de R$50, duas notas de R$10 e quatro notas de R$1");
								}else if(n1 == 0) {
									System.out.println("3 notas de R$100, uma nota de R$50 e Duas notas de 10");
								}
							}else if(n5 >= 1) {
								if(n1 == 1) {
									System.out.println("3 notas de R$100, uma nota de R$50, duas notas de R$10, uma nota de R$5 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("3 notas de R$100, uma nota de R$50, duas notas de R$10, uma nota de R$5 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("3 notas de R$100, uma nota de R$50, duas notas de R$10, uma nota de R$5 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("3 notas de R$100, uma nota de R$50, duas notas de R$10, uma nota de R$5 e quatro notas de R$1");
								}else if(n1== 0) {
									System.out.println("3 notas de R$100, uma nota de R$50, duas notas de R$10 e uma nota de R$5");
								}
							}
							
						}else if(n10 ==3) {
							if (n5 == 0) {
								if(n1 == 1) {
									System.out.println("3 notas de R$100, uma nota de R$50, tres notas de R$10 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("3 notas de R$100, uma nota de R$50, tres notas de R$10 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("3 notas de R$100, uma nota de R$50, tres notas de R$10 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("3 notas de R$100, uma nota de R$50, tres notas de R$10 e quatro notas de R$1");
								}else if(n1 == 0) {
									System.out.println("3 notas de R$100, uma nota de R$50, tres notas de 10");
								}
							}else if(n5 >= 1) {
								if(n1 == 1) {
									System.out.println("3 notas de R$100, uma nota de R$50, tres notas de R$10, uma nota de R$5 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("3 notas de R$100, uma nota de R$50, tres notas de R$10, uma nota de R$5 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("3 notas de R$100, uma nota de R$50, tres notas de R$10, uma nota de R$5 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("3 notas de R$100, uma nota de R$50, tres notas de R$10, uma nota de R$5 e quatro notas de R$1");
								}else if(n1== 0) {
									System.out.println("3 notas de R$100, uma nota de R$50, tres notas de R$10 e uma nota de R$5");
								}
							}
						}else if(n10 == 4) {
							if (n5 == 0) {
								if(n1 == 1) {
									System.out.println("3 notas de R$100, uma nota de R$50, quatro notas de R$10 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("3 notas de R$100, uma nota de R$50, quatro notas de R$10 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("3 notas de R$100, uma nota de R$50, quatro notas de R$10 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("3 notas de R$100, uma nota de R$50, quatro notas de R$10 e quatro notas de R$1");
								}else if(n1 == 0) {
									System.out.println("3 notas de R$100, uma nota de R$50 e quatro notas de 10");
								}
							}else if(n5 >= 1) {
								if(n1 == 1) {
									System.out.println("3 notas de R$100, uma nota de R$50, quatro notas de R$10, uma nota de R$5 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("3 notas de R$100, uma nota de R$50, quatro notas de R$10, uma nota de R$5 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("3 notas de R$100, uma nota de R$50, quatro notas de R$10, uma nota de R$5 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("3 notas de R$100, uma nota de R$50, quatro notas de R$10, uma nota de R$5 e quatro notas de R$1");
								}else if(n1== 0) {
									System.out.println("3 notas de R$100, uma nota de R$50, quatro notas de R$10 e uma nota de R$5");
								}
							}
						}
							
						}
				}else if (n100 == 4) {
					if(n50 == 0) {
						if(n10 ==0) {
							if (n5 == 0) {
								if(n1 == 1) {
									System.out.println("4 notas de R$100 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("4 notas de R$100 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("4 notas de R$100 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("4 notas de R$100 e quatro notas de R$1");
								}else if(n1==0) {
									System.out.println("4 notas de R$100");
								}
							}else if(n5 >= 1) {
								if(n1 == 1) {
									System.out.println("4 notas de R$100, uma nota de R$5 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("4 notas de R$100, uma nota de R$5 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("4 notas de R$100, uma nota de R$5 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("4 notas de R$100, uma nota de R$5 e quatro notas de R$1");
								}else if(n1 ==0) {
									System.out.println("4 notas de R$100, uma nota de R$5");
								}
							}
						}else if(n10 ==1) {
							if (n5 == 0) {
								if(n1 == 1) {
									System.out.println("4 notas de R$100, uma nota de R$10 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("4 notas de R$100, uma nota de R$10 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("4 notas de R$100, uma nota de R$10 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("4 notas de R$100, uma nota de R$10 e quatro notas de R$1");
								}else if(n1 == 0) {
									System.out.println("4 notas de R$100 e uma nota de 10");
								}
							}else if(n5 >= 1) {
								if(n1 == 1) {
									System.out.println("4 notas de R$100, uma nota de R$10, uma nota de R$5 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("4 notas de R$100, uma nota de R$10, uma nota de R$5 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("4 notas de R$100, uma nota de R$10, uma nota de R$5 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("4 notas de R$100, uma nota de R$10, uma nota de R$5 e quatro notas de R$1");
								}else if(n1== 0) {
									System.out.println("4 notas de R$100, uma nota de R$10 e uma nota de R$5");
								}
							}
							
						}else if(n10 == 2) {
							if (n5 == 0) {
								if(n1 == 1) {
									System.out.println("4 notas de R$100, duas notas de R$10 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("4 notas de R$100, duas notas de R$10 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("4 notas de R$100, duas notas de R$10 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("4 notas de R$100, duas notas de R$10 e quatro notas de R$1");
								}else if(n1 == 0) {
									System.out.println("4 notas de R$100 e duas notas de 10");
								}
							}else if(n5 >= 1) {
								if(n1 == 1) {
									System.out.println("4 notas de R$100, duas notas de R$10, uma nota de R$5 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("4 notas de R$100, duas notas de R$10, uma nota de R$5 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("4 notas de R$100, duas notas de R$10, uma nota de R$5 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("4 notas de R$100, duas notas de R$10, uma nota de R$5 e quatro notas de R$1");
								}else if(n1== 0) {
									System.out.println("4 notas de R$100, duas notas de R$10 e uma nota de R$5");
								}
							}
							
						}else if(n10 ==3) {
							if (n5 == 0) {
								if(n1 == 1) {
									System.out.println("4 notas de R$100, tres notas de R$10 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("4 notas de R$100, tres notas de R$10 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("4 notas de R$100, tres notas de R$10 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("4 notas de R$100, tres notas de R$10 e quatro notas de R$1");
								}else if(n1 == 0) {
									System.out.println("4 notas de R$100 e tres notas de 10");
								}
							}else if(n5 >= 1) {
								if(n1 == 1) {
									System.out.println("4 notas de R$100, tres notas de R$10, uma nota de R$5 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("4 notas de R$100, tres notas de R$10, uma nota de R$5 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("4 notas de R$100, tres notas de R$10, uma nota de R$5 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("4 notas de R$100, tres notas de R$10, uma nota de R$5 e quatro notas de R$1");
								}else if(n1== 0) {
									System.out.println("4 notas de R$100, tres notas de R$10 e uma nota de R$5");
								}
							}
						}else if(n10 == 4) {
							if (n5 == 0) {
								if(n1 == 1) {
									System.out.println("4 notas de R$100, quatro notas de R$10 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("4 notas de R$100, quatro notas de R$10 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("4 notas de R$100, quatro notas de R$10 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("4 notas de R$100, quatro notas de R$10 e quatro notas de R$1");
								}else if(n1 == 0) {
									System.out.println("4 notas de R$100 e quatro notas de 10");
								}
							}else if(n5 >= 1) {
								if(n1 == 1) {
									System.out.println("4 notas de R$100, quatro notas de R$10, uma nota de R$5 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("4 notas de R$100, quatro notas de R$10, uma nota de R$5 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("4 notas de R$100, quatro notas de R$10, uma nota de R$5 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("4 notas de R$100, quatro notas de R$10, uma nota de R$5 e quatro notas de R$1");
								}else if(n1== 0) {
									System.out.println("4 notas de R$100, quatro notas de R$10 e uma nota de R$5");
								}
							}
						}
						
					}else if(n50 >=1) {
						if(n10 ==0) {
							if (n5 == 0) {
								if(n1 == 1) {
									System.out.println("4 notas de R$100, uma nota de R$50 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("4 notas de R$100, uma nota de R$50 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("4 notas de R$100, uma nota de R$50 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("4 notas de R$100, uma nota de R$50 e quatro notas de R$1");
								}
							}else if(n5 >= 1) {
								if(n1 == 1) {
									System.out.println("4 notas de R$100, uma nota de R$50, uma nota de R$5 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("4 notas de R$100, uma nota de R$50, uma nota de R$5 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("4 notas de R$100, uma nota de R$50, uma nota de R$5 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("4 notas de R$100, uma nota de R$50, uma nota de R$5 e quatro notas de R$1");
								}else if(n1 ==0) {
									System.out.println("4 notas de R$100, uma nota de R$50 e uma nota de R$5");
								}
							}
						}else if(n10 ==1) {
							if (n5 == 0) {
								if(n1 == 1) {
									System.out.println("4 notas de R$100, uma nota de R$50, uma nota de R$10 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("4 notas de R$100, uma nota de R$50, uma nota de R$10 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("4 notas de R$100, uma nota de R$50, uma nota de R$10 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("4 notas de R$100, uma nota de R$50, uma nota de R$10 e quatro notas de R$1");
								}else if(n1 == 0) {
									System.out.println("4 notas de R$100, uma nota de R$50 e uma nota de 10");
								}
							}else if(n5 >= 1) {
								if(n1 == 1) {
									System.out.println("4 notas de R$100, uma nota de R$50, uma nota de R$10, uma nota de R$5 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("4 notas de R$100, uma nota de R$50, uma nota de R$10, uma nota de R$5 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("4 notas de R$100, uma nota de R$50, uma nota de R$10, uma nota de R$5 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("4 notas de R$100, uma nota de R$50, uma nota de R$10, uma nota de R$5 e quatro notas de R$1");
								}else if(n1== 0) {
									System.out.println("4 notas de R$100, uma nota de R$50, uma nota de R$10 e uma nota de R$5");
								}
							}
							
						}else if(n10 == 2) {
							if (n5 == 0) {
								if(n1 == 1) {
									System.out.println("4 notas de R$100, uma nota de R$50, duas notas de R$10 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("4 notas de R$100, uma nota de R$50, duas notas de R$10 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("4 notas de R$100, uma nota de R$50, duas notas de R$10 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("4 notas de R$100, uma nota de R$50, duas notas de R$10 e quatro notas de R$1");
								}else if(n1 == 0) {
									System.out.println("4 notas de R$100, uma nota de R$50 e Duas notas de 10");
								}
							}else if(n5 >= 1) {
								if(n1 == 1) {
									System.out.println("4 notas de R$100, uma nota de R$50, duas notas de R$10, uma nota de R$5 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("4 notas de R$100, uma nota de R$50, duas notas de R$10, uma nota de R$5 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("4 notas de R$100, uma nota de R$50, duas notas de R$10, uma nota de R$5 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("4 notas de R$100, uma nota de R$50, duas notas de R$10, uma nota de R$5 e quatro notas de R$1");
								}else if(n1== 0) {
									System.out.println("4 notas de R$100, uma nota de R$50, duas notas de R$10 e uma nota de R$5");
								}
							}
							
						}else if(n10 ==3) {
							if (n5 == 0) {
								if(n1 == 1) {
									System.out.println("4 notas de R$100, uma nota de R$50, tres notas de R$10 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("4 notas de R$100, uma nota de R$50, tres notas de R$10 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("4 notas de R$100, uma nota de R$50, tres notas de R$10 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("4 notas de R$100, uma nota de R$50, tres notas de R$10 e quatro notas de R$1");
								}else if(n1 == 0) {
									System.out.println("4 notas de R$100, uma nota de R$50, tres notas de 10");
								}
							}else if(n5 >= 1) {
								if(n1 == 1) {
									System.out.println("4 notas de R$100, uma nota de R$50, tres notas de R$10, uma nota de R$5 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("4 notas de R$100, uma nota de R$50, tres notas de R$10, uma nota de R$5 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("4 notas de R$100, uma nota de R$50, tres notas de R$10, uma nota de R$5 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("4 notas de R$100, uma nota de R$50, tres notas de R$10, uma nota de R$5 e quatro notas de R$1");
								}else if(n1== 0) {
									System.out.println("4 notas de R$100, uma nota de R$50, tres notas de R$10 e uma nota de R$5");
								}
							}
						}else if(n10 == 4) {
							if (n5 == 0) {
								if(n1 == 1) {
									System.out.println("4 notas de R$100, uma nota de R$50, quatro notas de R$10 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("4 notas de R$100, uma nota de R$50, quatro notas de R$10 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("4 notas de R$100, uma nota de R$50, quatro notas de R$10 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("4 notas de R$100, uma nota de R$50, quatro notas de R$10 e quatro notas de R$1");
								}else if(n1 == 0) {
									System.out.println("4 notas de R$100, uma nota de R$50 e quatro notas de 10");
								}
							}else if(n5 >= 1) {
								if(n1 == 1) {
									System.out.println("4 notas de R$100, uma nota de R$50, quatro notas de R$10, uma nota de R$5 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("4 notas de R$100, uma nota de R$50, quatro notas de R$10, uma nota de R$5 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("4 notas de R$100, uma nota de R$50, quatro notas de R$10, uma nota de R$5 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("4 notas de R$100, uma nota de R$50, quatro notas de R$10, uma nota de R$5 e quatro notas de R$1");
								}else if(n1== 0) {
									System.out.println("4 notas de R$100, uma nota de R$50, quatro notas de R$10 e uma nota de R$5");
								}
							}
						}
							
						}
				}else if (n100 == 5) {
					if(n50 == 0) {
						if(n10 ==0) {
							if (n5 == 0) {
								if(n1 == 1) {
									System.out.println("5 notas de R$100 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("5 notas de R$100 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("5 notas de R$100 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("5 notas de R$100 e quatro notas de R$1");
								}else if(n1==0) {
									System.out.println("5 notas de R$100");
								}
							}else if(n5 >= 1) {
								if(n1 == 1) {
									System.out.println("5 notas de R$100, uma nota de R$5 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("5 notas de R$100, uma nota de R$5 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("5 notas de R$100, uma nota de R$5 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("5 notas de R$100, uma nota de R$5 e quatro notas de R$1");
								}else if(n1 ==0) {
									System.out.println("5 notas de R$100, uma nota de R$5");
								}
							}
						}else if(n10 ==1) {
							if (n5 == 0) {
								if(n1 == 1) {
									System.out.println("5 notas de R$100, uma nota de R$10 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("5 notas de R$100, uma nota de R$10 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("5 notas de R$100, uma nota de R$10 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("5 notas de R$100, uma nota de R$10 e quatro notas de R$1");
								}else if(n1 == 0) {
									System.out.println("5 notas de R$100 e uma nota de 10");
								}
							}else if(n5 >= 1) {
								if(n1 == 1) {
									System.out.println("5 notas de R$100, uma nota de R$10, uma nota de R$5 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("5 notas de R$100, uma nota de R$10, uma nota de R$5 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("5 notas de R$100, uma nota de R$10, uma nota de R$5 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("5 notas de R$100, uma nota de R$10, uma nota de R$5 e quatro notas de R$1");
								}else if(n1== 0) {
									System.out.println("5 notas de R$100, uma nota de R$10 e uma nota de R$5");
								}
							}
							
						}else if(n10 == 2) {
							if (n5 == 0) {
								if(n1 == 1) {
									System.out.println("5 notas de R$100, duas notas de R$10 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("5 notas de R$100, duas notas de R$10 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("5 notas de R$100, duas notas de R$10 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("5 notas de R$100, duas notas de R$10 e quatro notas de R$1");
								}else if(n1 == 0) {
									System.out.println("5 notas de R$100 e duas notas de 10");
								}
							}else if(n5 >= 1) {
								if(n1 == 1) {
									System.out.println("5 notas de R$100, duas notas de R$10, uma nota de R$5 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("5 notas de R$100, duas notas de R$10, uma nota de R$5 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("5 notas de R$100, duas notas de R$10, uma nota de R$5 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("5 notas de R$100, duas notas de R$10, uma nota de R$5 e quatro notas de R$1");
								}else if(n1== 0) {
									System.out.println("5 notas de R$100, duas notas de R$10 e uma nota de R$5");
								}
							}
							
						}else if(n10 ==3) {
							if (n5 == 0) {
								if(n1 == 1) {
									System.out.println("5 notas de R$100, tres notas de R$10 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("5 notas de R$100, tres notas de R$10 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("5 notas de R$100, tres notas de R$10 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("5 notas de R$100, tres notas de R$10 e quatro notas de R$1");
								}else if(n1 == 0) {
									System.out.println("5 notas de R$100 e tres notas de 10");
								}
							}else if(n5 >= 1) {
								if(n1 == 1) {
									System.out.println("5 notas de R$100, tres notas de R$10, uma nota de R$5 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("5 notas de R$100, tres notas de R$10, uma nota de R$5 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("5 notas de R$100, tres notas de R$10, uma nota de R$5 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("5 notas de R$100, tres notas de R$10, uma nota de R$5 e quatro notas de R$1");
								}else if(n1== 0) {
									System.out.println("5 notas de R$100, tres notas de R$10 e uma nota de R$5");
								}
							}
						}else if(n10 == 4) {
							if (n5 == 0) {
								if(n1 == 1) {
									System.out.println("5 notas de R$100, quatro notas de R$10 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("5 notas de R$100, quatro notas de R$10 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("5 notas de R$100, quatro notas de R$10 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("5 notas de R$100, quatro notas de R$10 e quatro notas de R$1");
								}else if(n1 == 0) {
									System.out.println("5 notas de R$100 e quatro notas de 10");
								}
							}else if(n5 >= 1) {
								if(n1 == 1) {
									System.out.println("5 notas de R$100, quatro notas de R$10, uma nota de R$5 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("5 notas de R$100, quatro notas de R$10, uma nota de R$5 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("5 notas de R$100, quatro notas de R$10, uma nota de R$5 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("5 notas de R$100, quatro notas de R$10, uma nota de R$5 e quatro notas de R$1");
								}else if(n1== 0) {
									System.out.println("5 notas de R$100, quatro notas de R$10 e uma nota de R$5");
								}
							}
						}
						
					}else if(n50 >=1) {
						if(n10 ==0) {
							if (n5 == 0) {
								if(n1 == 1) {
									System.out.println("5 notas de R$100, uma nota de R$50 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("5 notas de R$100, uma nota de R$50 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("5 notas de R$100, uma nota de R$50 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("5 notas de R$100, uma nota de R$50 e quatro notas de R$1");
								}
							}else if(n5 >= 1) {
								if(n1 == 1) {
									System.out.println("5 notas de R$100, uma nota de R$50, uma nota de R$5 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("5 notas de R$100, uma nota de R$50, uma nota de R$5 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("5 notas de R$100, uma nota de R$50, uma nota de R$5 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("5 notas de R$100, uma nota de R$50, uma nota de R$5 e quatro notas de R$1");
								}else if(n1 ==0) {
									System.out.println("5 notas de R$100, uma nota de R$50 e uma nota de R$5");
								}
							}
						}else if(n10 ==1) {
							if (n5 == 0) {
								if(n1 == 1) {
									System.out.println("5 notas de R$100, uma nota de R$50, uma nota de R$10 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("5 notas de R$100, uma nota de R$50, uma nota de R$10 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("5 notas de R$100, uma nota de R$50, uma nota de R$10 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("5 notas de R$100, uma nota de R$50, uma nota de R$10 e quatro notas de R$1");
								}else if(n1 == 0) {
									System.out.println("5 notas de R$100, uma nota de R$50 e uma nota de 10");
								}
							}else if(n5 >= 1) {
								if(n1 == 1) {
									System.out.println("5 notas de R$100, uma nota de R$50, uma nota de R$10, uma nota de R$5 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("5 notas de R$100, uma nota de R$50, uma nota de R$10, uma nota de R$5 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("5 notas de R$100, uma nota de R$50, uma nota de R$10, uma nota de R$5 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("5 notas de R$100, uma nota de R$50, uma nota de R$10, uma nota de R$5 e quatro notas de R$1");
								}else if(n1== 0) {
									System.out.println("5 notas de R$100, uma nota de R$50, uma nota de R$10 e uma nota de R$5");
								}
							}
							
						}else if(n10 == 2) {
							if (n5 == 0) {
								if(n1 == 1) {
									System.out.println("5 notas de R$100, uma nota de R$50, duas notas de R$10 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("5 notas de R$100, uma nota de R$50, duas notas de R$10 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("5 notas de R$100, uma nota de R$50, duas notas de R$10 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("5 notas de R$100, uma nota de R$50, duas notas de R$10 e quatro notas de R$1");
								}else if(n1 == 0) {
									System.out.println("5 notas de R$100, uma nota de R$50 e Duas notas de 10");
								}
							}else if(n5 >= 1) {
								if(n1 == 1) {
									System.out.println("5 notas de R$100, uma nota de R$50, duas notas de R$10, uma nota de R$5 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("5 notas de R$100, uma nota de R$50, duas notas de R$10, uma nota de R$5 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("5 notas de R$100, uma nota de R$50, duas notas de R$10, uma nota de R$5 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("5 notas de R$100, uma nota de R$50, duas notas de R$10, uma nota de R$5 e quatro notas de R$1");
								}else if(n1== 0) {
									System.out.println("5 notas de R$100, uma nota de R$50, duas notas de R$10 e uma nota de R$5");
								}
							}
							
						}else if(n10 ==3) {
							if (n5 == 0) {
								if(n1 == 1) {
									System.out.println("5 notas de R$100, uma nota de R$50, tres notas de R$10 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("5 notas de R$100, uma nota de R$50, tres notas de R$10 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("5 notas de R$100, uma nota de R$50, tres notas de R$10 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("5 notas de R$100, uma nota de R$50, tres notas de R$10 e quatro notas de R$1");
								}else if(n1 == 0) {
									System.out.println("5 notas de R$100, uma nota de R$50, tres notas de 10");
								}
							}else if(n5 >= 1) {
								if(n1 == 1) {
									System.out.println("5 notas de R$100, uma nota de R$50, tres notas de R$10, uma nota de R$5 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("5 notas de R$100, uma nota de R$50, tres notas de R$10, uma nota de R$5 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("5 notas de R$100, uma nota de R$50, tres notas de R$10, uma nota de R$5 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("5 notas de R$100, uma nota de R$50, tres notas de R$10, uma nota de R$5 e quatro notas de R$1");
								}else if(n1== 0) {
									System.out.println("5 notas de R$100, uma nota de R$50, tres notas de R$10 e uma nota de R$5");
								}
							}
						}else if(n10 == 4) {
							if (n5 == 0) {
								if(n1 == 1) {
									System.out.println("5 notas de R$100, uma nota de R$50, quatro notas de R$10 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("5 notas de R$100, uma nota de R$50, quatro notas de R$10 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("5 notas de R$100, uma nota de R$50, quatro notas de R$10 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("5 notas de R$100, uma nota de R$50, quatro notas de R$10 e quatro notas de R$1");
								}else if(n1 == 0) {
									System.out.println("5 notas de R$100, uma nota de R$50 e quatro notas de 10");
								}
							}else if(n5 >= 1) {
								if(n1 == 1) {
									System.out.println("5 notas de R$100, uma nota de R$50, quatro notas de R$10, uma nota de R$5 e uma nota de R$1");
								}else if(n1==2) {
									System.out.println("5 notas de R$100, uma nota de R$50, quatro notas de R$10, uma nota de R$5 e duas notas de R$1");
								}else if(n1==3) {
									System.out.println("5 notas de R$100, uma nota de R$50, quatro notas de R$10, uma nota de R$5 e tres notas de R$1"); 
								}else if(n1 ==4) {
									System.out.println("5 notas de R$100, uma nota de R$50, quatro notas de R$10, uma nota de R$5 e quatro notas de R$1");
								}else if(n1== 0) {
									System.out.println("5 notas de R$100, uma nota de R$50, quatro notas de R$10 e uma nota de R$5");
								}
							}
						}
							
						}
				}else if(n100 == 6) {
					System.out.println("Seis notas de R$100");
			}
			
			
			
			
			
			
	}else {
		System.out.println("Valor invalido");
	}
		
		
}
}


package org.example;

// Klavyeden girilen N elemanlı A dizisi içinde (veri yığınında veya kayıty dosyasında )"İkili Arama (Binary Search)"
// algoritmasıyla sıralayan program

// İkili(binary) arama algoritmasında karşılaştırma işlemine, küçükten büyüğe sıralı olan dizinin ortasından başlanır.
// Aranan değer orta noktasından küçükse diğer kısım atılır ve dizi yarılanmış olur. Bir sonraki işlem tekrar orta akısımdan başlar.
// Tekrar aynı işlem yapılır ve eleman bulunana kadar ortalanarak işlem devam eder.
// Lütfen Dizi elemanlarının adedini girmeyi unutmayınız !!

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int ara;
        int k = 0;
        int ilk = 0;
        int orta = 0;
        int son = 12;

        int[] dizi = {1,1,2,3,5,8,9,12,13,14,15,21,34};

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nLütfen Aranan Değeri Giriniz : ");
        ara = scanner.nextInt();

        while ((ilk<=son) && (k!=1)){

            orta = (int) Math.floor((ilk+son)/2);
            if (ara<dizi[orta])
                son=orta-1;

            else if (ara>dizi[orta])
                ilk = orta+1;

            else
                k = 1;
        }

        if (k==1)
            System.out.printf("\nAradığınız Değer %d Sırada",orta+1);
        else
            System.out.print("\nGirmiş Olduğunuz Değer Yoktur.\n");
    }
}
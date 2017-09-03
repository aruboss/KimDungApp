package com.example.aruboss.hieuhaapp.CheckSyntax;

/**
 * Created by Aru Boss on 29/04/2017.
 */


public class Rules2 {

    static int count = 0;
    public String vowel = "aăâeêioôơuưy";
    public String consonants = "bcdđghklmnpqrstvx";
    public String finalConsonant = "cgmnpt";

    /**
     * ====================================================================
     * ======================= TOAN - CHECK CONSONANT =====================
     * ====================================================================
     */

    // tu tieng viet sai neu co ky tu dac biet
    public boolean checkInvalid0(String x) {
        String kiTuDacBiet = "0123456789fwjz~`!@#$%^&*()-_=+[{}]|;:'<>?/";
        for (int i = 0; i < x.length(); i++) {
            if (kiTuDacBiet.contains(String.valueOf(x.charAt(i)))) {
                return true;
            }
        }
        return false;
    }

    public boolean checkInvalid1(String x) {
        return x.length() > 7;
    }

    // co it nhat 1 nguyen am
    public boolean checkInvalid2(String x) {
        for (int i = 0; i < x.length(); i++) {
            if (consonants.contains(String.valueOf(x.charAt(i)))) {
                count++;
            }
        }
        return count == x.length();

    }

    // co 2 nguyen am tro len thi 2 nguyen am phai canh nhau
    public boolean checkInvalid3(String x) {
        for (int i = 0; i < x.length(); i++) {
            int temp = 0;
            if (!consonants.contains(String.valueOf(x.charAt(i)))) {
                temp = i;
                for (int j = i + 1; j < x.length(); j++) {
                    if (!consonants.contains(String.valueOf(x.charAt(j)))) {
                        temp++;
                        if (j - temp > 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    // tu tieng viet co toi da 3 nguyen am
    public boolean checkInvalid4(String x) {
        int temp = x.length();
        for (int i = 0; i < x.length(); i++) {
            if (consonants.contains(String.valueOf(x.charAt(i))))
                temp--;
        }
        return temp > 3;
    }

    // tu tieng viet ko cho phep 2 chu cai giong nhau canh nhau (tru oo)
    public boolean checkInvalid5(String x) {
        for (int i = 0; i < x.length() - 1; i++) {
            if ((x.charAt(i) == x.charAt(i + 1)) && (x.charAt(i) != 'o')) {
                return true;
            }
        }
        return false;
    }

    // nhung phu am chi co the dung dau
    public boolean checkInvalid6(String x) {
        String phuAmDau = "qsdklxvb";
        for (int i = 1; i < x.length(); i++) {
            if (phuAmDau.contains(String.valueOf(x.charAt(i)))) {
                return true;
            }
        }
        return false;
    }

	/* check phu am */
    // khong cho phep 3 phu am canh nhau tru ngh

    public boolean checkInvalid7(String x) {
        if (x.length() > 3) {
            for (int i = 0; i < x.length() - 2; i++) {
                if (consonants.contains(String.valueOf(x.charAt(i)))
                        && (consonants.contains(String.valueOf(x.charAt(i + 1))))
                        && consonants.contains(String.valueOf(x.charAt(i + 2)))
                        && ((x.charAt(i) != 'n') || x.charAt(i + 1) !=
                        'g' || x.charAt(i + 2) != 'h')) {
                    return true;
                }
            }
        }
        return false;
    }

    // check h
    public boolean checkH(String x) {
        String apterH = "ngcktp";
        boolean c = true;
        if (x.contains("h")) {
            if (x.charAt(0) == 'h') {
                if (consonants.contains(String.valueOf(x.charAt(1)))) {
                    c = false;
                }
            }
            if (x.charAt(x.length() - 1) == 'h') {
                if ((x.charAt(x.length() - 2) != 'n') && (x.charAt(x.length() - 2) != 'c')) {
                    c = false;
                }
            }
            if (x.charAt(1) == 'h') {
                if (!apterH.contains(String.valueOf(x.charAt(0)))) {
                    c = false;
                }
            }
            // if (x.length() > 3 && x.charAt(2) == 'h') {
            // if ((x.charAt(0) != 'n') || (x.charAt(1) != 'h')) {
            // c = false;
            // }
            // }
        }
        return c;
    }

    // check p
    public boolean checkP(String x) {
        String nguyenAm = "áạặắấậéẹếệíịóọốộớợúụứự";
        x = x.toLowerCase();
        // if(!x.contains("p"))
        // return true;
        if (x.contains("p")) {
            if (x.charAt(x.length() - 1) == 'p' &&
                    !(nguyenAm.contains(String.valueOf(x.charAt(x.length() - 2))))) {
                return false;
            }
            if (x.charAt(0) == 'p' && x.charAt(1) != 'h') {
                return false;
            }
        }
        return true;
    }

    // check c
    public boolean checkC(String x) {
        String tempC = consonants;
        String nguyenAmSau = "iíìịỉĩeéèẹẻẽêếềệểễ";
        String nguyenAmTruoc = "áạặắấậéẹếệíịóọốộớợúụứự";
        if (x.contains("c")) {
            if (x.charAt(0) == 'c' &&
                    (nguyenAmSau.contains(String.valueOf(x.charAt(1)))
                            || tempC.replace('h', 'c').contains(String.valueOf(x.charAt(1))))) {
                return false;
            }
            if (x.charAt(x.length() - 1) == 'c') {
                if (!(nguyenAmTruoc.contains(String.valueOf(x.charAt(x.length() - 2))))) {
                    return false;
                }
                if (x.length() > 3 && x.charAt(x.length() - 2) == 'o' && x.charAt(x.length() - 3) == 'o') {
                }
            }
            return true;
        }

        return true;
    }

    // check q
    public boolean checkQ(String x) {
        if (x.length() > 2 && x.contains("q")) {
            if (x.charAt(0) == 'q') {
                if (x.charAt(1) != 'u') {
                    return false;
                } else if (consonants.contains(String.valueOf(x.charAt(2)))) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    // check r
    public boolean checkR(String x) {
        if (x.contains("r")) {
            if (x.charAt(0) == 'r') {
                return !consonants.contains(String.valueOf(x.charAt(1)));
            } else
                return x.charAt(1) == 'r' && x.charAt(0) == 't';
        }
        return true;
    }

    public boolean checkT(String x) {
        String nguyenAm = "áạắặấậéẹíịóọốộớợúụếệứựýỵ";
        String temp = consonants;
        return !x.contains("t") || !(x.charAt(0) == 't'
                && temp.replace('h', 't').replace('r', 't').contains(String.valueOf(x.charAt(1)))) && !(x.charAt(x.length() - 1) == 't' && !(nguyenAm.contains(String.valueOf(x.charAt(x.length() - 2)))));
    }

    public boolean checkN(String x) {
        x = x.toLowerCase();
        String temp = consonants;
        if (x.contains("n")) {
            if (x.charAt(0) != 'n' && x.charAt(x.length() - 1) != 'n' && x.charAt(x.length() - 2) != 'n') {
                System.out.println("sai luat N");
                return false;
            }
            return !(x.charAt(x.length() - 1) == 'n' && consonants.contains(String.valueOf(x.charAt(x.length() - 2)))) && !(x.charAt(0) == 'n' && (x.charAt(1) != 'g' && x.charAt(1) != 'h' && temp.replace('g', 'n').replace('h', 'n').contains(String.valueOf(x.charAt(1))))) && !(x.charAt(x.length() - 2) == 'n' && (x.charAt(x.length() - 1) != 'g' && x.charAt(x.length() - 1) != 'h' && temp.replace('g', 'n').replace('h', 'n').contains(String.valueOf(x.charAt(1)))));

        }
        return true;
    }

    // check k

    public boolean checkK(String x) {
        String nguyenam = "iíìịỉĩeéèẹẻẽêếềệểễyýỳỵỷỹ";
        if (x.contains("k")) {
            if (x.charAt(0) == 'k' && (x.charAt(1) == 'h'
                    || nguyenam.contains(String.valueOf(x.charAt(1)))))
                return true;
            else {
                return false;
            }
        }
        return true;
    }

    // check g
    public boolean checkG(String x) {
        String nguyenam = "iíìịỉĩeéèẹẻẽêếềệểễ";
        String tempG = consonants;
        boolean c = true;
        if (x.contains("g")) {
            if (x.charAt(0) == 'g') {
                if (x.charAt(1) == 'h' && x.length() > 2) {
                    c = nguyenam.contains(String.valueOf(x.charAt(2)));
                }
                if (tempG.replace('h', 'g').contains(String.valueOf(x.charAt(1)))) {
                    c = false;
                }
            }
            if (x.charAt(x.length() - 1) == 'g') {
                if (x.charAt(x.length() - 2) != 'n') {
                    c = false;
                }
            }
        }

        return c;
    }

    // check s

    public boolean checkS(String x) {
        return !x.contains("s") || x.charAt(0) == 's'
                && !consonants.contains(String.valueOf(x.charAt(1)));
    }

    // kiem tra x
    public boolean checkX(String x) {
        return !x.contains("x") || x.charAt(0) == 'x'
                && !consonants.contains(String.valueOf(x.charAt(1)));
    }

    // kiem tra m
    public boolean checkM(String x) {
        if (x.contains("m")) {
            if (x.charAt(0) == 'm') {
                return !consonants.contains(String.valueOf(x.charAt(1)));
            } else
                return x.charAt(x.length() - 1) == 'm'
                        && !consonants.contains(String.valueOf(x.length() - 2));
        }
        return true;
    }

    // kiem tra b

    public boolean checkB(String x) {
        if (x.contains("b")) {
            if (x.charAt(0) == 'b') {
                if (!consonants.contains(String.valueOf(x.charAt(1))))
                    return true;
                else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    // check D
    public boolean checkD(String x) {
        return !x.contains("d") || x.charAt(0) == 'd'
                && !consonants.contains(String.valueOf(x.charAt(1)));
    }

    // check D
    public boolean checkĐ(String x) {
        return !x.contains("đ") || x.charAt(0) == 'đ'
                && !consonants.contains(String.valueOf(x.charAt(1)));
    }

    // check L
    public boolean checkL(String x) {
        return !x.contains("l") || x.charAt(0) == 'l'
                && !consonants.contains(String.valueOf(x.charAt(1)));
    }

    // check V
    public boolean checkV(String x) {
        return !x.contains("v") || x.charAt(0) == 'v'
                && !consonants.contains(String.valueOf(x.charAt(1)));
    }

    public boolean check(String x) {
        x = x.trim().toLowerCase();
        return !(checkInvalid0(x) || checkInvalid1(x) || checkInvalid2(x) || checkInvalid3(x) || checkInvalid4(x) || checkInvalid5(x) ||
                checkInvalid6(x) || checkInvalid7(x) || (!checkS(x)) || (!checkX(x))
                || (!checkD(x)) || (!checkĐ(x)) || (!checkL(x)) || (!checkV(x)) || (!checkB(x)) || (!checkM(x))
                || (!checkQ(x)) || (!checkR(x)) || (!checkC(x)) || (!checkH(x)) || (!checkP(x)) || (!checkT(x))
                || (!checkN(x)) || (!checkG(x)) || (!checkK(x)));
    }
}

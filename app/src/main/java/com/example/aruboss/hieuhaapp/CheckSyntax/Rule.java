package com.example.aruboss.hieuhaapp.CheckSyntax;

/**
 * Created by Aru Boss on 29/04/2017.
 */


public  class Rule {
    private String vowel = "aăâeêioôơuưyàáãạằắẵặầấậẫèéẽẹềếễệìíĩịòóõọồốỗộờớỡợùúũụừứữựỳýỹỵảẳẩẻểỉỏổởủửỷ";

    private int sac = 769;
    private int huyen = 768;
    private int nang = 803;
    private int hoi = 777;
    private int nga = 771;

    private String s1 = Character.toString((char) sac);
    private String s2 = Character.toString((char) huyen);
    private String s3 = Character.toString((char) nang);
    private String s4 = Character.toString((char) hoi);
    private String s5 = Character.toString((char) nga);

    private String vowelA = "aáàạãả";
    private String[] nonFirstConsonantA = {"gh", "k", "ngh", "q"};
    private String[] rhymeA = {"c", "ch", "i", "m", "n", "ng", "nh", "o", "p", "t", "u", "y"};
    private String[] nonRhymeA1 = {"c", "ch", "p", "t"}; // for a, à, ã

    private String vowelAW = "ăắặẵẳ";
    private String[] nonFirstConsonantAW = {"gh", "k", "ngh", "q"};
    private String[] rhymeAW = {"c", "m", "n", "ng", "p", "t"};
    private String[] nonRhymeAW1 = {"c", "p", "t"}; // for ă ằ ẵ

    private String vowelAA = "âấậầẫẩ";
    private String[] nonFirstConsonantAA = {"gh", "k", "ngh", "q"};
    private String[] rhymeAA = {"c", "m", "n", "ng", "p", "t", "u", "y"};
    private String[] nonRhymeAA1 = {"c", "p", "t"}; // for â ầ ẫ

    private String vowelE = "eèéẹẽẻ";
    private String[] nonFirstConsonantE = {"c", "g", "ng", "q"};
    private String[] rhymeE = {"c", "m", "n", "ng", "o", "p", "t"};
    private String[] nonrhymeE1 = {"c", "p", "t"}; // for e è ẽ
    private String[] nonrhymeE2 = {"c"}; // for ẹ

    private String vowelEE = "êềệếễể";
    private String[] nonFirstConsonantEE = {"c", "g", "ng", "q"};
    private String[] rhymeEE = {"ch", "m", "n", "nh", "p", "t", "u"};
    private String[] nonrhymeEE1 = {"ch", "p", "t"}; // for ê ề ễ

    private String vowelI = "iíịìĩỉ";
    private String[] nonFirstConsonantI = {"c", "ng", "q", "qu"};
    private String[] rhymeI = {"a", "êc", "êm", "ên", "êng", "êp", "êu", "êt", "ch", "m", "n", "nh", "p", "t", "u"};
    // for i
    private String[] rhymeI1 = {"êc", "êp", "êt", "ch", "p", "t"};
    // for í ị
    private String[] rhymeI2 = {"êc", "êm", "ên", "êng", "êp", "êu", "êt"};
    // for ì ĩ
    private String[] rhymeI3 = {"êc", "êm", "ên", "êng", "êp", "êu", "êt", "p", "t"};

    private String vowelO = "oóọòõỏ";
    private String[] nonFirstConsonantO = {"gh", "k", "ngh", "q"};
    private String[] consonantLastO = {"a", "ac", "ăc", "ach", "ai", "am", "ăm", "an", "ăn", "ang", "ăng", "anh", "ao", "ap",
            "at", "ăt", "ay", "c", "e", "em", "en", "eng", "eo", "et", "i", "m", "n", "ng", "oc", "ong", "p", "t"};

    // for o
    private String[] rhymeO1 = {"c", "p", "t"};
    // for ó ọ
    private String[] rhymeO2 = {"ac", "ăc", "ach", "ai", "am", "ăm", "an", "ăn", "ang", "ăng", "anh", "ao", "ap", "at", "ăt",
            "ay", "em", "en", "eng", "eo", "et", "oc", "ong"};

    // for ò õ
    private String[] rhymeO3 = {"ac", "ăc", "ach", "ai", "am", "ăm", "an", "ăn", "ang", "ăng", "anh", "ao", "ap", "at", "ăt",
            "ay", "em", "en", "eng", "eo", "et", "oc", "ong", "c", "p", "t"};

    private String vowelOO = "ôồốỗộổ";
    private String[] nonFirstConsonantOO = {"gh", "k", "ngh", "q"};
    private String[] rhymeOO = {"c", "i", "m", "n", "ng", "ôc", "ông", "p", "t"};
    // for ô
    private String[] rhymeOO1 = {"c", "ôc", "p", "t"};
    // for ồ ỗ
    private String[] rhymeOO2 = {"c", "ôc", "ông", "p", "t"};
    // for ố ộ
    private String[] rhymeOO3 = {"ôc", "ông"};

    private String vowelOW = "ơớờợỡở";
    private String[] nonFirstConsonantOW = {"gh", "k", "ngh", "q"};
    private String[] rhymeOW = {"c", "i", "m", "n", "ng", "p", "t"};
    // for ơ ờ ỡ
    private String[] rhymeOW1 = {"c", "p", "t"};

    private String vowelU = "uúùũụủ";
    private String[] nonFirstConsonantU = {"k", "ngh", "gh"};
    private String[] rhymeU = {"a", "âc", "âm", "ân", "ât", "ây", "c", "ê", "ên", "ênh", "êt", "i", "m", "n", "ng", "ơ", "ôc",
            "ôi", "ôm", "ôn", "ông", "ôt", "p", "t", "y", "ya", "ych", "yên", "yêt", "yn", "ynh", "yp", "yu", "yt",
            "êch"};
    // for u
    private String[] rhymeU1 = {"âc", "ât", "ây", "c", "êt", "ôc", "ôt", "p", "t", "ych", "yêt", "yp", "yt", "êch"};
    // for ù ũ
    private String[] rhymeU2 = {"âc", "âm", "ân", "ât", "ây", "c", "ê", "ên", "ênh", "êt", "ơ", "ôc", "ôi", "ôm", "ôn", "ông",
            "ôt", "p", "t", "ya", "ych", "yên", "yêt", "yn", "ynh", "yp", "yu", "yt", "êch", "âng"};
    // for ú ụ
    private String[] rhymeU3 = {"âc", "âm", "ân", "ât", "ây", "ê", "ên", "ênh", "êt", "ơ", "ôc", "ôi", "ôm", "ôn", "ông", "ôt",
            "ya", "ych", "yên", "yêt", "yn", "ynh", "yp", "yu", "yt", "êch", "âng"};

    private String vowelUW = "ưứừựữử";
    private String[] nonFirstConsonantUW = {"k", "ngh", "gh", "q"};
    private String[] rhymeUW = {"a", "c", "i", "m", "n", "ng", "ơc", "ơi", "ơm", "ơn", "ơng", "ơp", "ơt", "ơu", "t", "u"};
    // for ư
    private String[] rhymeUW1 = {"c", "ơc", "ơp", "ơt", "t"};
    // for ừ ữ
    private String[] rhymeUW2 = {"c", "ơc", "ơi", "ơm", "ơn", "ơng", "ơp", "ơt", "ơu", "t"};
    // for ứ ự
    private String[] rhymeUW3 = {"ơc", "ơi", "ơm", "ơn", "ơng", "ơp", "ơt", "ơu"};

    private String vowelY = "yýỳỵỹỷ";
    private String[] firstConsonantY = {"k", "h", "l", "m", "n", "t", "th", "s", "v"};
    private String[] consonantLastY = {"êm", "ên", "êng", "êt", "êu"};

    // Bo thanh dau trong tieng viet
    private static String removeAccent(String alias) {
        String str = alias;
        str = str.toLowerCase();
        str = str.replaceAll("[àáạảã]", "a");
        str = str.replaceAll("[ằắặẳẵ]", "ă");
        str = str.replaceAll("[ầấậẩẫ]", "â");
        str = str.replaceAll("[èéẹẻẽ]", "e");
        str = str.replaceAll("[ềếệểễ]", "ê");
        str = str.replaceAll("[ìíịỉĩ]", "i");
        str = str.replaceAll("[òóọỏõ]", "o");
        str = str.replaceAll("[ồốộổỗ]", "ô");
        str = str.replaceAll("[ờớợởỡ]", "ơ");
        str = str.replaceAll("[ùúụủũ]", "u");
        str = str.replaceAll("[ừứựửữ]", "ư");
        str = str.replaceAll("[ỳýỵỷỹ]", "y");

        return str;
    }

    private boolean checkVowel(String x) {
        x = x.toLowerCase().trim();
        x = removeAccent(x);
        String mVowel = "aăâeêioôơuưy";

        int count = 0;
        for (int i = 0; i < x.length(); i++) {
            if (s1.equals(String.valueOf(x.charAt(i))) || s2.equals(String.valueOf(x.charAt(i)))
                    || s3.equals(String.valueOf(x.charAt(i))) || s4.equals(String.valueOf(x.charAt(i)))
                    || s5.equals(String.valueOf(x.charAt(i)))) {
                return true;
            }
            if (mVowel.contains(String.valueOf(x.charAt(i)))) {
                count++;
            }
        }
        return count > 0 && count < 4;
    }

    // Kiem tra a
    private boolean checkA(String x) {
        x = x.toLowerCase().trim();

        String[] specialConsonant = {"gi", "qu"};

        int count = 0;
        String temp = "";

        for (int i = 0; i < x.length(); i++) {
            if (s1.equals(String.valueOf(x.charAt(i))) || s2.equals(String.valueOf(x.charAt(i)))
                    || s3.equals(String.valueOf(x.charAt(i))) || s4.equals(String.valueOf(x.charAt(i)))
                    || s5.equals(String.valueOf(x.charAt(i)))) {
                return true;
            }
            if (vowelA.contains(String.valueOf(x.charAt(i)))) {
                count++;
                temp = String.valueOf(x.charAt(i));
            }
        }
        if (count == 1) {
            // cat phu am dau
            String sub = x.substring(0, x.indexOf(temp));

            // check phu am dau
            if (sub.equals(nonFirstConsonantA[0]) || sub.equals(nonFirstConsonantA[1])
                    || sub.equals(nonFirstConsonantA[2]) || sub.equals(nonFirstConsonantA[3])) {
                return false;
            } else if (sub.equals(specialConsonant[0]) || sub.equals(specialConsonant[1])) {
                return true;
            }

            // cat phan cuoi sau nguyen am a
            String last = x.substring(x.indexOf(temp) + 1, x.length());
            last = removeAccent(last);

            // neu co mot nguyen am khac thi k check
            if (sub.length() - 1 >= 0 && vowel.contains(String.valueOf(sub.charAt(sub.length() - 1)))) {
                return true;
            }

            // check last is empty
            if (!last.equals("")) {

                // check rhyme special
                if (temp.equals("a") || temp.equals("à") || temp.equals("ã")) {
                    if (nonRhymeA1[0].equals(last) || nonRhymeA1[1].equals(last)
                            || nonRhymeA1[2].equals(last)
                            || nonRhymeA1[3].equals(last)) {
                        return false;
                    }
                }

                // duyet rhyme sau a
                for (int j = 0; j < rhymeA.length; j++) {
                    if (rhymeA[j].equals(last)) {
                        return true;
                    }
                }

                // sau khi duyet khong co
                return false;
            } else
                return true;
        } else if (count > 2) {
            return false;
        }
        return true;
    }

    // check ă
    private boolean checkAW(String x) {
        x = x.toLowerCase().trim();
        String[] specialConsonant = {"gi", "qu"};

        int count = 0;
        String temp = "";

        for (int i = 0; i < x.length(); i++) {
            if (s1.equals(String.valueOf(x.charAt(i))) || s2.equals(String.valueOf(x.charAt(i)))
                    || s3.equals(String.valueOf(x.charAt(i))) || s4.equals(String.valueOf(x.charAt(i)))
                    || s5.equals(String.valueOf(x.charAt(i)))) {
                return true;
            }
            if (vowelAW.contains(String.valueOf(x.charAt(i)))) {
                count++;
                temp = String.valueOf(x.charAt(i));
            }
        }
        if (count == 1) {
            String sub = x.substring(0, x.indexOf(temp));
            if (sub.equals(nonFirstConsonantAW[0]) || sub.equals(nonFirstConsonantAW[1])
                    || sub.equals(nonFirstConsonantAW[2]) || sub.equals(nonFirstConsonantAW[3])) {
                return false;
            } else if (sub.equals(specialConsonant[0]) || sub.equals(specialConsonant[1])) {
                return true;
            }
            String last = x.substring(x.indexOf(temp) + 1, x.length());
            last = removeAccent(last);
            // neu co mot nguyen am khac thi k check
            if (sub.length() - 1 >= 0 && vowel.contains(String.valueOf(sub.charAt(sub.length() - 1)))) {
                return true;
            }

            if (!last.equals("")) {

                // check phu am gi, qu
                if (specialConsonant[0].equals(sub) || specialConsonant[1].equals(sub)) {
                    return true;
                }

                // check non rhyme
                if (temp.equals("ă") || temp.equals("ẵ") || temp.equals("ằ") || temp.equals("ẳ")) {
                    if (nonRhymeAW1[0].equals(last) || nonRhymeAW1[1].equals(last) || nonRhymeAW1[2].equals(last)) {
                        return false;
                    }
                }
                for (String aRhymeAW : rhymeAW) {
                    if (aRhymeAW.equals(last)) {
                        return true;
                    }
                }
                return false;
            } else {
                // check phu am gi, qu
                return !(specialConsonant[0].equals(sub) || specialConsonant[1].equals(sub));
            }
        } else if (count > 2) {
            return false;
        }
        return true;
    }

    // check â
    private boolean checkAA(String x) {
        x = x.toLowerCase().trim();

        String[] specialConsonant = {"gi", "qu"};

        int count = 0;
        String temp = "";

        for (int i = 0; i < x.length(); i++) {
            if (s1.equals(String.valueOf(x.charAt(i))) || s2.equals(String.valueOf(x.charAt(i)))
                    || s3.equals(String.valueOf(x.charAt(i))) || s4.equals(String.valueOf(x.charAt(i)))
                    || s5.equals(String.valueOf(x.charAt(i)))) {
                return true;
            }
            if (vowelAA.contains(String.valueOf(x.charAt(i)))) {
                count++;
                temp = String.valueOf(x.charAt(i));
            }
        }

        if (count == 1) {
            String sub = x.substring(0, x.indexOf(temp));

            if (sub.equals(nonFirstConsonantAA[0]) || sub.equals(nonFirstConsonantAA[1])
                    || sub.equals(nonFirstConsonantAA[2]) || sub.equals(nonFirstConsonantAA[3])) {
                return false;
            } else if (sub.equals(specialConsonant[0]) || sub.equals(specialConsonant[1])) {
                return true;
            }

            String last = x.substring(x.indexOf(temp) + 1, x.length());
            last = removeAccent(last);

            // neu co mot nguyen am khac thi k check
            if (sub.length() - 1 >= 0 && vowel.contains(String.valueOf(sub.charAt(sub.length() - 1)))) {
                return true;
            }

            if (!last.equals("")) {

                if (temp.equals("â") || temp.equals("ẫ") || temp.equals("ầ") || temp.equals("ẩ")) {
                    if (nonRhymeAA1[0].equals(last) || nonRhymeAA1[1].equals(last) || nonRhymeAA1[2].equals(last)) {
                        return false;
                    }
                }

                for (String aRhymeAA : rhymeAA) {
                    if (aRhymeAA.equals(last)) {
                        return true;
                    }
                }
                return false;
            } else
                return true;

        } else if (count > 2) {
            return false;
        }
        return true;
    }

    // Kiem tra e
    public boolean checkE(String x) {
        x = x.toLowerCase().trim();
        int count = 0;
        String temp = "";

        for (int i = 0; i < x.length(); i++) {
            if (s1.equals(String.valueOf(x.charAt(i))) || s2.equals(String.valueOf(x.charAt(i)))
                    || s3.equals(String.valueOf(x.charAt(i))) || s4.equals(String.valueOf(x.charAt(i)))
                    || s5.equals(String.valueOf(x.charAt(i)))) {
                return true;
            }
            if (vowelE.contains(String.valueOf(x.charAt(i)))) {
                count++;
                temp = String.valueOf(x.charAt(i));
            }
        }
        if (count == 1) {
            String sub = x.substring(0, x.indexOf(temp));
            if (sub.equals(nonFirstConsonantE[0]) || sub.equals(nonFirstConsonantE[1])
                    || sub.equals(nonFirstConsonantE[2]) || sub.equals(nonFirstConsonantE[3])) {
                return false;
            }

            String last = x.substring(x.indexOf(temp) + 1, x.length());
            last = removeAccent(last);

            // neu co mot nguyen am khac thi k check
            if (sub.length() - 1 >= 0 && vowel.contains(String.valueOf(sub.charAt(sub.length() - 1)))) {
                return true;
            }

            if (!last.equals("")) {

                if (temp.equals("ẹ")) {
                    if (nonrhymeE2[0].equals(last)) {
                        return false;
                    }
                }

                if (temp.equals("e") || temp.equals("è") || temp.equals("ẽ") || temp.equals("ẻ")) {
                    if (nonrhymeE1[0].equals(last) || nonrhymeE1[1].equals(last) || nonrhymeE1[2].equals(last)) {
                        return false;
                    }
                }

                for (int j = 0; j < rhymeE.length; j++) {
                    if (rhymeE[j].equals(last)) {
                        return true;
                    }
                }
                return false;
            } else {
                return true;
            }

        } else if (count > 2) {
            return false;
        }
        return true;
    }

    // Check ê
    public boolean checkEE(String x) {
        x = x.toLowerCase().trim();
        int count = 0;
        String temp = "";

        for (int i = 0; i < x.length(); i++) {
            if (s1.equals(String.valueOf(x.charAt(i))) || s2.equals(String.valueOf(x.charAt(i)))
                    || s3.equals(String.valueOf(x.charAt(i))) || s4.equals(String.valueOf(x.charAt(i)))
                    || s5.equals(String.valueOf(x.charAt(i)))) {
                return true;
            }
            if (vowelEE.contains(String.valueOf(x.charAt(i)))) {
                count++;
                temp = String.valueOf(x.charAt(i));
            }
        }
        if (count == 1) {

            String sub = x.substring(0, x.indexOf(temp));
            if (sub.equals(nonFirstConsonantEE[0]) || sub.equals(nonFirstConsonantEE[1])
                    || sub.equals(nonFirstConsonantEE[2]) || sub.equals(nonFirstConsonantEE[3])) {
                return false;
            }

            String last = x.substring(x.indexOf(temp) + 1, x.length());
            last = removeAccent(last);

            // neu co mot nguyen am khac thi k check
            if (sub.length() - 1 >= 0 && vowel.contains(String.valueOf(sub.charAt(sub.length() - 1)))) {
                return true;
            }

            if (!last.equals("")) {
                if (temp.equals("ê") || temp.equals("ề") || temp.equals("ễ") || temp.equals("ể")) {
                    if (nonrhymeEE1[0].equals(last) || nonrhymeEE1[1].equals(last) || nonrhymeEE1[2].equals(last)) {
                        return false;
                    }
                }
                for (int j = 0; j < rhymeEE.length; j++) {
                    if (rhymeEE[j].equals(last)) {
                        return true;
                    }
                }
                return false;
            } else
                return true;
        } else if (count > 2) {
            return false;
        }
        return true;
    }

    // Kiem tra i
    public boolean checkI(String x) {
        x = x.toLowerCase().trim();
        String vowel = "aăâeêioôơuưy";

        int count = 0;
        String temp = "";

        for (int i = 0; i < x.length(); i++) {
            if (s1.equals(String.valueOf(x.charAt(i))) || s2.equals(String.valueOf(x.charAt(i)))
                    || s3.equals(String.valueOf(x.charAt(i))) || s4.equals(String.valueOf(x.charAt(i)))
                    || s5.equals(String.valueOf(x.charAt(i)))) {
                return true;
            }
            if (vowelI.contains(String.valueOf(x.charAt(i)))) {
                count++;
                temp = String.valueOf(x.charAt(i));
            }
        }
        if (count == 1) {
            String sub = x.substring(0, x.indexOf(temp));
            if (sub.equals(nonFirstConsonantI[0]) || sub.equals(nonFirstConsonantI[1])
                    || sub.equals(nonFirstConsonantI[2]) || sub.equals(nonFirstConsonantI[3])) {
                return false;
            }

            // neu la phu am gi thi tra ve true
            if (sub.equals("g")) {
                return true;
            }
            // rhyme after i
            String last = x.substring(x.indexOf(temp) + 1, x.length());

            // remove accent last for non i
            String rLast = removeAccent(last);

            // neu co mot nguyen am khac thi k check
            if (sub.length() - 1 >= 0 && vowel.contains(String.valueOf(sub.charAt(sub.length() - 1)))) {
                return true;
            }

            if (!last.equals("")) {
                if (temp.equals("i")) {
                    for (int i = 0; i < rhymeI1.length; i++) {
                        if (rhymeI1[i].equals(last)) {
                            return false;
                        }
                    }
                }
                if (temp.equals("í") || temp.equals("ị")) {
                    for (int i = 0; i < rhymeI2.length; i++) {
                        if (rhymeI2[i].equals(rLast)) {
                            return false;
                        }
                    }
                }
                if (temp.equals("ì") || temp.equals("ĩ") || temp.equals("ỉ")) {
                    for (int i = 0; i < rhymeI3.length; i++) {
                        if (rhymeI3[i].equals(rLast)) {
                            return false;
                        }
                    }
                }
                for (int j = 0; j < rhymeI.length; j++) {
                    if (rhymeI[j].equals(rLast)) {
                        return true;
                    }
                }
                return false;
            } else
                return true;
        } else if (count > 2) {
            return false;
        }
        return true;
    }

    // Check o
    public boolean checkO(String x) {
        x = x.toLowerCase().trim();

        int count = 0;
        String temp = "";

        for (int i = 0; i < x.length(); i++) {
            if (s1.equals(String.valueOf(x.charAt(i))) || s2.equals(String.valueOf(x.charAt(i)))
                    || s3.equals(String.valueOf(x.charAt(i))) || s4.equals(String.valueOf(x.charAt(i)))
                    || s5.equals(String.valueOf(x.charAt(i)))) {
                return true;
            }
            if (vowelO.contains(String.valueOf(x.charAt(i)))) {
                count++;
                temp = String.valueOf(x.charAt(i));
            }
        }
        if (count == 1) {
            String sub = x.substring(0, x.indexOf(temp));
            if (sub.equals(nonFirstConsonantO[0]) || sub.equals(nonFirstConsonantO[1])
                    || sub.equals(nonFirstConsonantO[2]) || sub.equals(nonFirstConsonantO[3])) {
                return false;
            }
            String last = x.substring(x.indexOf(temp) + 1, x.length());
            String rlast = removeAccent(last);

            // neu co mot nguyen am khac thi k check
            if (sub.length() - 1 >= 0 && vowel.contains(String.valueOf(sub.charAt(sub.length() - 1)))) {
                return true;
            }

            if (!last.equals("")) {

                if (temp.equals("o")) {
                    for (int i = 0; i < rhymeO1.length; i++) {
                        if (rhymeO1[i].equals(last)) {
                            return false;
                        }
                    }
                }
                if (temp.equals("ó") || temp.equals("ọ")) {
                    for (int i = 0; i < rhymeO2.length; i++) {
                        if (rhymeO2[i].equals(rlast)) {
                            return false;
                        }
                    }
                }
                if (temp.equals("ò") || temp.equals("õ") || temp.equals("ỏ")) {
                    for (int i = 0; i < rhymeO3.length; i++) {
                        if (rhymeO3[i].equals(rlast)) {
                            return false;
                        }
                    }
                }
                for (int j = 0; j < consonantLastO.length; j++) {
                    if (consonantLastO[j].equals(rlast)) {
                        return true;
                    }
                }
                return false;
            } else
                return true;
        } else if (count == 2) {
            try {
                if ("o".equals(x.charAt(x.indexOf('o') + 1))) {
                    return false;
                } else
                    return true;
            } catch (Exception e) {
                return true;
            }
        }
        return true;
    }

    // Check oo
    public boolean checkOO(String x) {
        x = x.toLowerCase().trim();

        int count = 0;
        String temp = "";

        for (int i = 0; i < x.length(); i++) {
            if (s1.equals(String.valueOf(x.charAt(i))) || s2.equals(String.valueOf(x.charAt(i)))
                    || s3.equals(String.valueOf(x.charAt(i))) || s4.equals(String.valueOf(x.charAt(i)))
                    || s5.equals(String.valueOf(x.charAt(i)))) {
                return true;
            }
            if (vowelOO.contains(String.valueOf(x.charAt(i)))) {
                count++;
                temp = String.valueOf(x.charAt(i));
            }
        }
        if (count == 1) {
            String sub = x.substring(0, x.indexOf(temp));
            if (sub.equals(nonFirstConsonantOO[0]) || sub.equals(nonFirstConsonantOO[1])
                    || sub.equals(nonFirstConsonantOO[2]) || sub.equals(nonFirstConsonantOO[3])) {
                return false;
            }

            String last = x.substring(x.indexOf(temp) + 1, x.length());
            String rlast = removeAccent(last);

            // neu co mot nguyen am khac thi k check
            if (sub.length() - 1 >= 0 && vowel.contains(String.valueOf(sub.charAt(sub.length() - 1)))) {
                return true;
            }

            if (!last.equals("")) {
                if (temp.equals("ô")) {
                    if (rhymeOO1[0].equals(last) || rhymeOO1[1].equals(last) || rhymeOO1[2].equals(last)
                            || rhymeOO1[3].equals(last)) {
                        return false;
                    }
                }
                if (temp.equals("ồ") || temp.equals("ỗ") || temp.equals("ổ")) {
                    if (rhymeOO2[0].equals(rlast) || rhymeOO2[1].equals(rlast) || rhymeOO2[2].equals(rlast)
                            || rhymeOO2[3].equals(rlast) || rhymeOO2[4].equals(rlast)) {
                        return false;
                    }
                }
                if (temp.equals("ố") || temp.equals("ộ")) {
                    if (rhymeOO3[0].equals(rlast) || rhymeOO3[1].equals(rlast)) {
                        return false;
                    }
                }
                for (int j = 0; j < rhymeOO.length; j++) {
                    if (rhymeOO[j].equals(rlast)) {
                        return true;
                    }
                }
                return false;
            } else
                return true;
        } else if (count > 2) {
            return false;
        }
        return true;
    }

    public boolean checkOW(String x) {
        x = x.toLowerCase().trim();

        int count = 0;
        String temp = "";

        for (int i = 0; i < x.length(); i++) {
            if (s1.equals(String.valueOf(x.charAt(i))) || s2.equals(String.valueOf(x.charAt(i)))
                    || s3.equals(String.valueOf(x.charAt(i))) || s4.equals(String.valueOf(x.charAt(i)))
                    || s5.equals(String.valueOf(x.charAt(i)))) {
                return true;
            }
            if (vowelOW.contains(String.valueOf(x.charAt(i)))) {
                count++;
                temp = String.valueOf(x.charAt(i));
            }
        }
        if (count == 1) {
            String sub = x.substring(0, x.indexOf(temp));
            if (sub.equals(nonFirstConsonantOW[0]) || sub.equals(nonFirstConsonantOW[1])
                    || sub.equals(nonFirstConsonantOW[2]) || sub.equals(nonFirstConsonantOW[3])) {
                return false;
            }

            String last = x.substring(x.indexOf(temp) + 1, x.length());
            String rlast = removeAccent(last);

            // neu co mot nguyen am khac thi k check
            if (sub.length() - 1 >= 0 && vowel.contains(String.valueOf(sub.charAt(sub.length() - 1)))) {
                return true;
            }

            if (!last.equals("")) {
                if (temp.equals("ơ")) {
                    if (rhymeOW1[0].equals(last) || rhymeOW1[1].equals(last) || rhymeOW1[2].equals(last)) {
                        return false;
                    }
                }
                if (temp.equals("ờ") || temp.equals("ỡ") || temp.equals("ở")) {
                    if (rhymeOW1[0].equals(rlast) || rhymeOW1[1].equals(rlast) || rhymeOW1[2].equals(rlast)) {
                        return false;
                    }
                }
                for (int j = 0; j < rhymeOW.length; j++) {
                    if (rhymeOW[j].equals(rlast)) {
                        return true;
                    }
                }
                return false;
            } else
                return true;
        } else if (count > 2) {
            return false;
        }
        return true;
    }

    // check u
    public boolean checkU(String x) {
        x = x.toLowerCase().trim();

        int count = 0;
        String temp = "";

        for (int i = 0; i < x.length(); i++) {
            if (s1.equals(String.valueOf(x.charAt(i))) || s2.equals(String.valueOf(x.charAt(i)))
                    || s3.equals(String.valueOf(x.charAt(i))) || s4.equals(String.valueOf(x.charAt(i)))
                    || s5.equals(String.valueOf(x.charAt(i)))) {
                return true;
            }
            if (vowelU.contains(String.valueOf(x.charAt(i)))) {
                count++;
                temp = String.valueOf(x.charAt(i));
            }
        }
        if (count == 1) {
            String sub = x.substring(0, x.indexOf(temp));

            if (sub.equals("q")) {
                return true;
            }
            if (sub.equals(nonFirstConsonantU[0]) || sub.equals(nonFirstConsonantU[1])
                    || sub.equals(nonFirstConsonantU[2])) {
                return false;
            }

            String last = x.substring(x.indexOf(temp) + 1, x.length());
            String rlast = removeAccent(last);

            // neu co mot nguyen am khac thi k check
            if (sub.length() - 1 >= 0 && vowel.contains(String.valueOf(sub.charAt(sub.length() - 1)))) {
                return true;
            }

            if (!last.equals("")) {
                if (temp.equals("u")) {
                    for (int i = 0; i < rhymeU1.length; i++) {
                        if (rhymeU1[i].equals(last)) {
                            return false;
                        }
                    }
                }
                if (temp.equals("ù") || temp.equals("ũ") || temp.equals("ủ")) {
                    for (int i = 0; i < rhymeU2.length; i++) {
                        if (rhymeU2[i].equals(rlast)) {
                            return false;
                        }
                    }
                }
                if (temp.equals("ú") || temp.equals("ụ")) {
                    for (int i = 0; i < rhymeU3.length; i++) {
                        if (rhymeU3[i].equals(rlast)) {
                            return false;
                        }
                    }
                }
                for (int j = 0; j < rhymeU.length; j++) {
                    if (rhymeU[j].equals(rlast)) {
                        return true;
                    }
                }
                return false;
            } else {
                if (!temp.equals("u")) {
                    if (sub.equals("q")) {
                        return false;
                    }
                }
                return true;
            }
        } else if (count > 2) {
            return false;
        }
        return true;
    }

    // check ư
    public boolean checkUW(String x) {
        x = x.toLowerCase().trim();

        int count = 0;
        String temp = "";

        for (int i = 0; i < x.length(); i++) {
            if (s1.equals(String.valueOf(x.charAt(i))) || s2.equals(String.valueOf(x.charAt(i)))
                    || s3.equals(String.valueOf(x.charAt(i))) || s4.equals(String.valueOf(x.charAt(i)))
                    || s5.equals(String.valueOf(x.charAt(i)))) {
                return true;
            }
            if (vowelUW.contains(String.valueOf(x.charAt(i)))) {
                count++;
                temp = String.valueOf(x.charAt(i));
            }
        }
        if (count == 1) {
            String sub = x.substring(0, x.indexOf(temp));
            if (sub.equals(nonFirstConsonantUW[0]) || sub.equals(nonFirstConsonantUW[1])
                    || sub.equals(nonFirstConsonantUW[2]) || sub.equals(nonFirstConsonantUW[3])) {
                return false;
            }

            String last = x.substring(x.indexOf(temp) + 1, x.length());
            String rlast = removeAccent(last);

            // neu co mot nguyen am khac thi k check
            if (sub.length() - 1 >= 0 && vowel.contains(String.valueOf(sub.charAt(sub.length() - 1)))) {
                return true;
            }

            if (!last.equals("")) {
                if (temp.equals("ư")) {
                    for (int i = 0; i < rhymeUW1.length; i++) {
                        if (rhymeUW1[i].equals(last)) {
                            return false;
                        }
                    }
                }
                if (temp.equals("ừ") || temp.equals("ữ") || temp.equals("ử")) {
                    for (int i = 0; i < rhymeUW2.length; i++) {
                        if (rhymeUW2[i].equals(rlast)) {
                            return false;
                        }
                    }
                }
                if (temp.equals("ứ") || temp.equals("ự")) {
                    for (int i = 0; i < rhymeUW3.length; i++) {
                        if (rhymeUW3[i].equals(rlast)) {
                            return false;
                        }
                    }
                }
                for (int j = 0; j < rhymeUW.length; j++) {
                    if (rhymeUW[j].equals(rlast)) {
                        return true;
                    }
                }
                return false;
            } else
                return true;
        } else if (count > 2) {
            return false;
        }
        return true;
    }

    // check y
    public boolean checkY(String x) {
        x = x.toLowerCase().trim();
        int count = 0;
        String temp = "";

        for (int i = 0; i < x.length(); i++) {
            if (s1.equals(String.valueOf(x.charAt(i))) || s2.equals(String.valueOf(x.charAt(i)))
                    || s3.equals(String.valueOf(x.charAt(i))) || s4.equals(String.valueOf(x.charAt(i)))
                    || s5.equals(String.valueOf(x.charAt(i)))) {
                return true;
            }
            if (vowelY.contains(String.valueOf(x.charAt(i)))) {
                count++;
                temp = String.valueOf(x.charAt(i));
            }
        }

        if (count == 1) {
            String sub = x.substring(0, x.indexOf(temp));
            String last = x.substring(x.indexOf(temp) + 1, x.length());
            last = removeAccent(last);

            // kiem tra xem truoc y co phu am
            if (sub.equals("")) {
                if (!last.equals("")) {
                    for (int j = 0; j < consonantLastY.length; j++) {
                        if (consonantLastY[j].equals(last)) {
                            return true;
                        }
                    }
                    return false;
                } else
                    return true;
            } else {
                // neu co mot nguyen am khac thi k check
                if (sub.length() - 1 >= 0 && vowel.contains(String.valueOf(sub.charAt(sub.length() - 1)))) {
                    return true;
                }

                if (last.equals("")) {
                    for (int i = 0; i < firstConsonantY.length; i++) {
                        if (firstConsonantY.equals(sub)) {
                            return true;
                        }
                    }
                    return false;
                }
            }
        } else if (count > 2) {
            return false;
        }
        return true;
    }

    public boolean checkVowelTotal(String x) {
        if (x.equals(" "))
            return true;
        if (!checkVowel(x)) {
            return false;
        }
        return !(!checkA(x) || !checkAW(x) || !checkAA(x) || !checkE(x) || !checkEE(x) || !checkI(x) || !checkO(x)
                || !checkOO(x) || !checkOW(x) || !checkU(x) || !checkUW(x));
    }
}


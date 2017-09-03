package com.example.aruboss.hieuhaapp.CheckSyntax;

/**
 * Created by Aru Boss on 29/04/2017.
 */


public class RuleVowel {

    // Bo thanh dau trong tieng viet
    public static String removeAccent(String alias )
    {
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

    // Kiem tra a
    public boolean checkA(String x) {
        x.toLowerCase().trim();
        String vowelA = "aáàạã";
        String[] nonFirstConsonantA = {"gh", "k", "ngh", "q"};
        String[] consonantA = {"c", "ch", "i", "m", "n", "ng", "nh", "o", "p", "t", "u", "y"};
        int count = 0;
        String temp = "";

        for (int i = 0; i < x.length(); i ++) {
            if (vowelA.contains(String.valueOf(x.charAt(i)))) {
                count++;
                temp = String.valueOf(x.charAt(i));
            }
        }
        if (count == 1) {
            String sub = x.substring(0, x.indexOf(temp));
            if (sub.equals(nonFirstConsonantA[0]) || sub.equals(nonFirstConsonantA[1])
                    || sub.equals(nonFirstConsonantA[2]) || sub.equals(nonFirstConsonantA[3])) {
                return false;
            }
            String last = x.substring(x.indexOf(temp) + 1, x.length());


            if (!last.equals("")) {
                if (temp.equals("a") || temp.equals("à")) {
                    if (consonantA[0].equals(last) || consonantA[1].equals(last) ||
                            consonantA[8].equals(last) || consonantA[9].equals(last)) {
                        return false;
                    }
                }
                if (temp.equals("ã")) {
                    if (consonantA[0].equals(last) || consonantA[8].equals(last) ||
                            consonantA[9].equals(last)) {
                        return false;
                    }
                }
                for (int j = 0; j < consonantA.length; j++) {
                    if (consonantA[j].contains(last)) {
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

    // check ă
    public boolean checkAW(String x) {
        x.toLowerCase().trim();
        String vowelAW = "ăắặẵ";
        String[] nonFirstConsonantAW = {"gh", "k", "ngh", "q"};
        String[] consonantAW = {"c", "m", "n", "ng", "p", "t"};
        int count = 0;
        String temp = "";

        for (int i = 0; i < x.length(); i ++) {
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
            }
            String last = x.substring(x.indexOf(temp) + 1, x.length());


            if (!last.equals("")) {
                if (temp.equals("ă") || temp.equals("ẵ")) {
                    if (consonantAW[0].equals(last) || consonantAW[4].equals(last) ||
                            consonantAW[5].equals(last)) {
                        return false;
                    }
                }
                for (int j = 0; j < consonantAW.length; j++) {
                    if (consonantAW[j].contains(last)) {
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

    // check â
    public boolean checkAA(String x) {
        x.toLowerCase().trim();
        String vowelAA = "âấậầẫ";
        String[] nonFirstConsonantAA = {"gh", "k", "ngh", "q"};
        String[] consonantAA = {"c", "m", "n", "ng", "p", "t", "u", "y"};
        int count = 0;
        String temp = "";

        for (int i = 0; i < x.length(); i ++) {
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
            }
            String last = x.substring(x.indexOf(temp) + 1, x.length());


            if (!last.equals("")) {
                if (temp.equals("â") || temp.equals("ẫ") || temp.equals("ầ")) {
                    if (consonantAA[0].equals(last) || consonantAA[4].equals(last) ||
                            consonantAA[5].equals(last)) {
                        return false;
                    }
                }
                for (int j = 0; j < consonantAA.length; j++) {
                    if (consonantAA[j].contains(last)) {
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
        x.toLowerCase().trim();
        String vowelE = "eèéẹ";
        String[] nonFirstConsonantE = {"c", "g", "ng", "q"};
        String[] consonantLastE = {"c", "ch", "m", "n", "ng", "o", "p", "t"};
        int count = 0;
        String temp = "";

        for (int i = 0; i < x.length(); i ++) {
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


            if (!last.equals("")) {
                if (temp.equals("e") || temp.equals("è") || temp.equals("ẹ")) {
                    if (consonantLastE[0].equals(last) || consonantLastE[1].equals(last) ||
                            consonantLastE[6].equals(last) || consonantLastE[7].equals(last)) {
                        return false;
                    }
                }
                for (int j = 0; j < consonantLastE.length; j++) {
                    if (consonantLastE[j].contains(last)) {
                        return true;
                    }
                }
                return false;
            } else if (last == "") {
                return true;
            }

        } else if (count > 2) {
            return false;
        }
        return true;
    }

    // Check ê
    public boolean checkEE(String x) {
        x.toLowerCase().trim();
        String vowelEE = "êềệếễ";
        String[] nonFirstConsonantEE = {"c", "g", "ng", "q"};
        String[] consonantLastEE = {"ch", "m", "n", "nh", "p", "t", "u"};
        int count = 0;
        String temp = "";

        for (int i = 0; i < x.length(); i ++) {
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
            if ("iou".contains(String.valueOf(x.charAt(x.indexOf(temp) - 1)))) {
                return true;
            }

            if (!last.equals("")) {
                if (temp.equals("ê") || temp.equals("ề") || temp.equals("ệ")) {
                    if (consonantLastEE[0].equals(last) || consonantLastEE[4].equals(last) ||
                            consonantLastEE[5].equals(last)) {
                        return false;
                    }
                }
                for (int j = 0; j < consonantLastEE.length; j++) {
                    if (consonantLastEE[j].contains(last)) {
                        return true;
                    }
                }
                return false;
            } else if (last =="") {
                return true;
            }
        } else if (count > 2) {
            return false;
        }
        return true;
    }
    // Kiem tra i
    public boolean checkI(String x) {
        x.toLowerCase().trim();
        String vowelE = "iíịìĩ";
        String[] nonFirstConsonantI = {"c","ng", "q", "qu"};
        String[] consonantLastI = {"a", "êc", "êm", "ên", "êng", "êp", "êu",
                "êt", "ch", "m", "n", "nh", "p", "t", "u"};
        int count = 0;
        String temp = "";

        for (int i = 0; i < x.length(); i ++) {
            if (vowelE.contains(String.valueOf(x.charAt(i)))) {
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
            String last = x.substring(x.indexOf(temp) + 1, x.length());

            last = removeAccent(last);


            if (!last.equals("")) {
                if (temp.equals("i") || temp.equals("ì") || temp.equals("ĩ")) {
                    if (consonantLastI[8].equals(last) || consonantLastI[12].equals(last) ||
                            consonantLastI[13].equals(last)) {
                        return false;
                    }
                }
                if (temp.equals("ì") || temp.equals("í") || temp.equals("ĩ") || temp.equals("ị")) {
                    if (consonantLastI[1].equals(last) || consonantLastI[2].equals(last) ||
                            consonantLastI[3].equals(last) || consonantLastI[4].equals(last) ||
                            consonantLastI[5].equals(last) || consonantLastI[6].equals(last) ||
                            consonantLastI[7].equals(last)) {
                        return false;
                    }
                }
                for (int j = 0; j < consonantLastI.length; j++) {
                    if (consonantLastI[j].contains(last)) {
                        return true;
                    }
                }
                return false;
            } else if (last == "") {
                return true;
            }
            return false;
        } else if (count > 2) {
            return false;
        }
        return true;
    }

    // Check o
    public boolean checkO(String x) {
        x.toLowerCase().trim();
        String vowelO = "oóọòõ";
        String[] nonFirstConsonantO = {"gh", "k", "ngh", "q"};
        String[] consonantLastO = {"a", "ac", "ăc", "ach", "ai", "am", "ăm", "an", "ăn",
                "ang", "ăng", "anh", "ao", "ap", "at", "ăt", "ay", "c"};
        int count = 0;
        String temp = "";

        for (int i = 0; i < x.length(); i ++) {
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
            last = removeAccent(last);

            if (!last.equals("")) {
                if (temp.equals("o") || temp.equals("ò") || temp.equals("õ")) {
                    if (consonantLastO[1].equals(last) || consonantLastO[2].equals(last) ||
                            consonantLastO[13].equals(last) || consonantLastO[14].equals(last) ||
                            consonantLastO[15].equals(last) || consonantLastO[16].equals(last)) {
                        return false;
                    }
                }
                for (int j = 0; j < consonantLastO.length; j++) {
                    if (consonantLastO[j].contains(last)) {
                        return true;
                    }
                }
                return false;
            } else
                return true;
        } else if (count == 2) {
            if ("o".equals(x.charAt(x.indexOf('o') + 1))) {
                return false;
            } else return true;
        }
        return true;
    }

    // Check oo
    public boolean checkOO(String x) {
        x.toLowerCase().trim();
        String vowelOO = "ôồốỗộ";
        String[] nonFirstConsonantOO = {"gh", "k", "ngh", "q"};
        String[] consonantLastOO = {"c", "i", "m", "n", "ng", "ôc", "ông", "p", "t"};
        int count = 0;
        String temp = "";

        for (int i = 0; i < x.length(); i ++) {
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
            last = removeAccent(last);


            if (!last.equals("")) {
                if (temp.equals("ô") || temp.equals("ồ") || temp.equals("ỗ")) {
                    if (consonantLastOO[0].equals(last) || consonantLastOO[7].equals(last) ||
                            consonantLastOO[8].equals(last)) {
                        return false;
                    }
                }
                for (int j = 0; j < consonantLastOO.length; j++) {
                    if (consonantLastOO[j].contains(last)) {
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
        x.toLowerCase().trim();
        String vowelOW = "ơớờợỡ";
        String[] nonFirstConsonantOW = {"gh", "k", "ngh", "q"};
        String[] consonantLastOW = {"c", "i", "m", "n", "ng", "p", "t"};
        int count = 0;
        String temp = "";

        for (int i = 0; i < x.length(); i ++) {
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
            last = removeAccent(last);


            if (!last.equals("")) {
                if (temp.equals("ơ") || temp.equals("ờ") || temp.equals("ỡ")) {
                    if (consonantLastOW[0].equals(last) || consonantLastOW[5].equals(last) ||
                            consonantLastOW[6].equals(last)) {
                        return false;
                    }
                }
                for (int j = 0; j < consonantLastOW.length; j++) {
                    if (consonantLastOW[j].contains(last)) {
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
        x.toLowerCase().trim();
        String vowelU = "uúùũụ";
        String[] nonFirstConsonantU = {"k", "ngh", "gh"};
        String[] consonantLastU = {"a", "âc", "âm", "ân", "ât", "ây", "c", "ê",
                "ên", "ênh", "êt", "i", "m", "n", "ng", "ơ", "ôc", "ôi", "ôm",
                "ôn", "ông", "ôt", "p", "t", "y", "ya", "ych", "yên", "yêt", "yn",
                "ynh", "yp", "yu", "yt"};
        int count = 0;
        String temp = "";

        for (int i = 0; i < x.length(); i ++) {
            if (vowelU.contains(String.valueOf(x.charAt(i)))) {
                count++;
                temp = String.valueOf(x.charAt(i));
            }
        }
        if (count == 1) {
            String sub = x.substring(0, x.indexOf(temp));
            if (sub.equals(nonFirstConsonantU[0]) || sub.equals(nonFirstConsonantU[1])
                    || sub.equals(nonFirstConsonantU[2])) {
                return false;
            }
            String last = x.substring(x.indexOf(temp) + 1, x.length());
            last = removeAccent(last);

            if (!last.equals("")) {

                if (temp.equals("ú") || temp.equals("ù") || temp.equals("ũ") || temp.equals("ụ")) {
                    if (!consonantLastU[0].equals(last) || !consonantLastU[11].equals(last) ||
                            !consonantLastU[12].equals(last) || !consonantLastU[13].equals(last) ||
                            !consonantLastU[consonantLastU.length - 1].equals(last)) {
                        return false;
                    }
                }

                if (temp.equals("ù") || temp.equals("u") || temp.endsWith("ũ")) {
                    if (consonantLastU[22].equals(last) || consonantLastU[23].equals(last)) {
                        return false;
                    }
                }
                for (int j = 0; j < consonantLastU.length; j++) {
                    if (consonantLastU[j].contains(last)) {
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

    // check ư
    public boolean checkUW(String x) {
        x.toLowerCase().trim();
        String vowelUW = "ưứừựữ";
        String[] nonFirstConsonantUW = {"k", "ngh", "gh"};
        String[] consonantLastUW = {"a", "c", "i", "m", "n", "ng", "ơc", "ơi", "ơm",
                "ơn", "ơng", "ơp", "ơt", "ơu", "t", "u"};
        int count = 0;
        String temp = "";

        for (int i = 0; i < x.length(); i ++) {
            if (vowelUW.contains(String.valueOf(x.charAt(i)))) {
                count++;
                temp = String.valueOf(x.charAt(i));
            }
        }
        if (count == 1) {
            String sub = x.substring(0, x.indexOf(temp));
            if (sub.equals(nonFirstConsonantUW[0]) || sub.equals(nonFirstConsonantUW[1])
                    || sub.equals(nonFirstConsonantUW[2])) {
                return false;
            }
            String last = x.substring(x.indexOf(temp) + 1, x.length());
            last = removeAccent(last);
            if (!last.equals("")) {
                for (int j = 0; j < consonantLastUW.length; j++) {
                    if (consonantLastUW[j].contains(last)) {
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
        x.toLowerCase().trim();
        String vowelY = "yýỳỵỹ";
        String[] firstConsonantY = {"k", "h", "l", "m", "n", "qu", "t", "th", "s", "v"};
        String[] consonantLastY = {"êm", "ên", "êng", "êt", "êu"};
        int count = 0;
        String temp = "";
        boolean mark = false;

        for (int i = 0; i < x.length(); i ++) {
            if (vowelY.contains(String.valueOf(x.charAt(i)))) {
                count++;
                temp = String.valueOf(x.charAt(i));
                return true;
            }
        }
//    	if (count == 1) {
//			String sub = x.substring(0, x.indexOf(temp));
//			if (!sub.equals("")) {
//				for (int s = 0; s < firstConsonantY.length; s++) {
//					if (firstConsonantY[s].equals(sub)) {
//						mark = true;
//						break;
//					}
//				}
//				if (!mark) {
//					return false;
//				}
//			}
//			String last = x.substring(x.indexOf(temp) + 1, x.length());
//			last = removeAccent(last);
//
//			if (sub.equals("") && last.equals("")) {
//				return true;
//			}
//
//			if (mark && last.equals("")) {
//				return true;
//			}
//
//			if (x.indexOf(temp) >= 1 &&
//					"aâu".contains(removeAccent(String.valueOf(x.charAt(x.indexOf(temp) - 1))))) {
//				return true;
//			}
//
//			if (!last.equals("")) {
//				for (int j = 0; j < consonantLastY.length; j++) {
//					if (consonantLastY[j].contains(last)) {
//						return true;
//					}
//				}
//				return false;
//			} else
//				return true;
//		} else if (count > 2) {
//			return false;
//		}
        return true;
    }

    public boolean checkVowelTotal(String x) {
        if (!checkA(x) || !checkAW(x) || !checkAA(x) || !checkE(x)
                || !checkEE(x) || !checkI(x) || !checkO(x) || !checkOO(x) || !checkOW(x)
                || !checkU(x) || !checkUW(x) || !checkY(x)) {
            return false;
        }
        return true;
    }
}





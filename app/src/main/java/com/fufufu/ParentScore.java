package com.fufufu;

public class ParentScore {

    public ParentScore() {

    }

    public static String tsumoScore(int han, int fu) {
        if (han == 1) {
            if (fu == 20) {
                throw new IllegalStateException("この上がり方は存在しません。");
            } else if (fu == 25) {
                throw new IllegalStateException("この上がり方は存在しません。");
            } else if (fu == 30) {
                return "500 オール";
            } else if (fu == 40) {
                return "700 オール";
            } else if (fu == 50) {
                return "800 オール";
            } else if (fu == 60) {
                return "1000 オール";
            } else if (fu == 70) {
                return "1200 オール";
            } else if (fu == 80) {
                return "1300 オール";
            } else if (fu == 90) {
                return "1500 オール";
            } else if (fu == 100) {
                return "1600 オール";
            } else if (fu == 110) {
                return "1800 オール";
            }
        } else if (han == 2) {
            if (fu == 20) {
                return "700 オール";
            } else if (fu == 25) {
                throw new IllegalStateException("この上がり方は存在しません。");
            } else if (fu == 30) {
                return "1000 オール";
            } else if (fu == 40) {
                return "1300 オール";
            } else if (fu == 50) {
                return "1600 オール";
            } else if (fu == 60) {
                return "2000 オール";
            } else if (fu == 70) {
                return "2300 オール";
            } else if (fu == 80) {
                return "2600 オール";
            } else if (fu == 90) {
                return "2900 オール";
            } else if (fu == 100) {
                return "3200 オール";
            } else if (fu == 110) {
                return "3600 オール";
            }
        } else if (han == 3) {
            if (fu == 20) {
                return "1300 オール";
            } else if (fu == 25) {
                return "1600 オール";
            } else if (fu == 30) {
                return "2000 オール";
            } else if (fu == 40) {
                return "2600 オール";
            } else if (fu == 50) {
                return "3200 オール";
            } else if (fu == 60) {
                return "3900 オール";
            } else if (fu >= 70 && fu <= 110) {
                return "4000 オール";
            }
        } else if (han == 4) {
            if (fu == 20) {
                return "2600 オール";
            } else if (fu == 25) {
                return "3200 オール";
            } else if (fu == 30) {
                return "3900 オール";
            } else if (fu >= 40 && fu <= 110) {
                return "4000 オール";
            }
        } else if (han == 5) {
            return "4000 オール";
        } else if (han == 6 || han == 7) {
            return "6000 オール";
        } else if (han == 8 || han == 9 || han == 10) {
            return "8000 オール";
        } else if (han == 11 || han == 12) {
            return "12000 オール";
        } else if (han == 13) {
            return "16000 オール";
        }
        return null;
    }

    public static String ronScore(int han, int fu) {
        if (han == 1) {
            if (fu == 20) {
                throw new IllegalStateException("この上がり方は存在しません。");
            } else if (fu == 25) {
                throw new IllegalStateException("この上がり方は存在しません。");
            } else if (fu == 30) {
                return "1500";
            } else if (fu == 40) {
                return "2000";
            } else if (fu == 50) {
                return "2400";
            } else if (fu == 60) {
                return "2900";
            } else if (fu == 70) {
                return "3400";
            } else if (fu == 80) {
                return "3900";
            } else if (fu == 90) {
                return "4400";
            } else if (fu == 100) {
                return "4800";
            } else if (fu == 110) {
                return "5300";
            }
        } else if (han == 2) {
            if (fu == 20) {
                throw new IllegalStateException("この上がり方は存在しません。");
            } else if (fu == 25) {
                return "2400";
            } else if (fu == 30) {
                return "2900";
            } else if (fu == 40) {
                return "3900";
            } else if (fu == 50) {
                return "4800";
            } else if (fu == 60) {
                return "5800";
            } else if (fu == 70) {
                return "6800";
            } else if (fu == 80) {
                return "7700";
            } else if (fu == 90) {
                return "8700";
            } else if (fu == 100) {
                return "9600";
            } else if (fu == 110) {
                return "10600";
            }
        } else if (han == 3) {
            if (fu == 20) {
                throw new IllegalStateException("この上がり方は存在しません。");
            } else if (fu == 25) {
                return "4800";
            } else if (fu == 30) {
                return "5800";
            } else if (fu == 40) {
                return "7700";
            } else if (fu == 50) {
                return "9600";
            } else if (fu == 60) {
                return "11600";
            } else if (fu >= 70 && fu <= 110) {
                return "12000";
            }
        } else if (han == 4) {
            if (fu == 20) {
                throw new IllegalStateException("この上がり方は存在しません。");
            } else if (fu == 25) {
                return "9600";
            } else if (fu == 30) {
                return "11600";
            } else if (fu >= 40 && fu <= 110) {
                return "12000";
            }
        } else if (han == 5) {
            return "12000";
        } else if (han == 6 || han == 7) {
            return "18000";
        } else if (han == 8 || han == 9 || han == 10) {
            return "24000";
        } else if (han == 11 || han == 12) {
            return "36000";
        } else if (han == 13) {
            return "48000";
        }
        return null;
    }

}

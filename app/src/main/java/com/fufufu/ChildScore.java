package com.fufufu;

public class ChildScore {

    public ChildScore() {

    }

    public static String tsumoScore(int han, int fu) {
        if (han == 1) {
            if (fu == 20) {
                throw new IllegalStateException("この上がり方は存在しません。");
            } else if (fu == 25) {
                throw new IllegalStateException("この上がり方は存在しません。");
            } else if (fu == 30) {
                return "300 / 500";
            } else if (fu == 40) {
                return "400 / 700";
            } else if (fu == 50) {
                return "400 / 800";
            } else if (fu == 60) {
                return "500 / 1000";
            } else if (fu == 70) {
                return "600 / 1200";
            } else if (fu == 80) {
                return "700 / 1300";
            } else if (fu == 90) {
                return "800 / 1500";
            } else if (fu == 100) {
                return "800 / 1600";
            } else if (fu == 110) {
                return "900 / 1800";
            }
        } else if (han == 2) {
            if (fu == 20) {
                return "400 / 700";
            } else if (fu == 25) {
                throw new IllegalStateException("この上がり方は存在しません。");
            } else if (fu == 30) {
                return "500 / 1000";
            } else if (fu == 40) {
                return "700 / 1300";
            } else if (fu == 50) {
                return "800 / 1600";
            } else if (fu == 60) {
                return "1000 / 2000";
            } else if (fu == 70) {
                return "1200 / 2300";
            } else if (fu == 80) {
                return "1300 / 2600";
            } else if (fu == 90) {
                return "1500 / 2900";
            } else if (fu == 100) {
                return "1600 / 3200";
            } else if (fu == 110) {
                return "1800 / 3600";
            }
        } else if (han == 3) {
            if (fu == 20) {
                return "700 / 1300";
            } else if (fu == 25) {
                return "800 / 1600";
            } else if (fu == 30) {
                return "1000 / 2000";
            } else if (fu == 40) {
                return "1300 / 2600";
            } else if (fu == 50) {
                return "1600 / 3200";
            } else if (fu == 60) {
                return "2000 / 3900";
            } else if (fu >= 70 && fu <= 110) {
                return "2000 / 4000";
            }
        } else if (han == 4) {
            if (fu == 20) {
                return "1300 / 2600";
            } else if (fu == 25) {
                return "1600 / 3200";
            } else if (fu == 30) {
                return "2000 / 3900";
            } else if (fu >= 40 && fu <= 110) {
                return "2000 / 4000";
            }
        } else if (han == 5) {
            return "2000 / 4000";
        } else if (han == 6 || han == 7) {
            return "3000 / 6000";
        } else if (han == 8 || han == 9 || han == 10) {
            return "4000 / 8000";
        } else if (han == 11 || han == 12) {
            return "6000 / 12000";
        } else if (han == 13) {
            return "8000 / 16000";
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
                return "1000";
            } else if (fu == 40) {
                return "1300";
            } else if (fu == 50) {
                return "1600";
            } else if (fu == 60) {
                return "2000";
            } else if (fu == 70) {
                return "2300";
            } else if (fu == 80) {
                return "2600";
            } else if (fu == 90) {
                return "2900";
            } else if (fu == 100) {
                return "3200";
            } else if (fu == 110) {
                return "3600";
            }
        } else if (han == 2) {
            if (fu == 20) {
                throw new IllegalStateException("この上がり方は存在しません。");
            } else if (fu == 25) {
                return "1600";
            } else if (fu == 30) {
                return "2000";
            } else if (fu == 40) {
                return "2600";
            } else if (fu == 50) {
                return "3200";
            } else if (fu == 60) {
                return "3900";
            } else if (fu == 70) {
                return "4500";
            } else if (fu == 80) {
                return "5200";
            } else if (fu == 90) {
                return "5800";
            } else if (fu == 100) {
                return "6400";
            } else if (fu == 110) {
                return "7100";
            }
        } else if (han == 3) {
            if (fu == 20) {
                throw new IllegalStateException("この上がり方は存在しません。");
            } else if (fu == 25) {
                return "3200";
            } else if (fu == 30) {
                return "3900";
            } else if (fu == 40) {
                return "5200";
            } else if (fu == 50) {
                return "6400";
            } else if (fu == 60) {
                return "7700";
            } else if (fu >= 70 && fu <= 110) {
                return "8000";
            }
        } else if (han == 4) {
            if (fu == 20) {
                throw new IllegalStateException("この上がり方は存在しません。");
            } else if (fu == 25) {
                return "6400";
            } else if (fu == 30) {
                return "7700";
            } else if (fu >= 40 && fu <= 110) {
                return "8000";
            }
        } else if (han == 5) {
            return "8000";
        } else if (han == 6 || han == 7) {
            return "12000";
        } else if (han == 8 || han == 9 || han == 10) {
            return "16000";
        } else if (han == 11 || han == 12) {
            return "24000";
        } else if (han == 13) {
            return "32000";
        }
        return null;
    }

}

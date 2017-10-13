package com.github.patwakeem.asm.enumeration;

public enum AsmCheckInterval {
    FIVE_MIN {
        @Override
        public String toString() {
            return "300";
        }
    },
    TEN_MIN {
        @Override
        public String toString() {
            return "600";
        }
    },
    FIFTEEN_MIN {
        @Override
        public String toString() {
            return "900";
        }
    },
    TWENTY_MIN {
        @Override
        public String toString() {
            return "1200";
        }
    },
    THIRTY_MIN {
        @Override
        public String toString() {
            return "1800";
        }
    },
    ONE_HOUR {
        @Override
        public String toString() {
            return "3600";
        }
    },
    TWO_HOURS {
        @Override
        public String toString() {
            return "7200";
        }
    },
    FOUR_HOURS {
        @Override
        public String toString() {
            return "14400";
        }
    },
    SIX_HOURS {
        @Override
        public String toString() {
            return "21600";
        }
    },
    TWELVE_HOURS {
        @Override
        public String toString() {
            return "43200";
        }
    },
    ONE_DAY {
        @Override
        public String toString() {
            return "86400";
        }
    }
}

package com.github.patwakeem.asm.enumeration;

public enum CheckType {
    BROWSER {
        @Override
        public String toString() {
            return "browser";
        }
    },
    URL {
        @Override
        public String toString() {
            return "url";
        }
    },
    PORT {
        @Override
        public String toString() {
            return "port";
        }
    },
    PING {
        @Override
        public String toString() {
            return "ping";
        }
    }
}
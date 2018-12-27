package com.wesker.builder;

/**
 * 建造者模式
 * 这种写法也是effective java推荐的写法
 * @author MR.ZHANG
 * @create 2018-12-21 11:57
 */
public class NumberBuild {
    private String one = "default";
    private String two = "default";
    private String three = "default";
    private int four = 0;

    private NumberBuild(Builder builder) {
        this.one = builder.one;
        this.two = builder.two;
        this.three = builder.three;
        this.four = builder.four;
    }

    @Override
    public String toString() {
        return "NumberBuild{" +
                "one='" + one + '\'' +
                ", two='" + two + '\'' +
                ", three='" + three + '\'' +
                ", four=" + four +
                '}';
    }

    public static class Builder {
        private String one = "default";
        private String two = "default";
        private String three = "default";
        private int four = 0;

        /**
         * 不让其他方式创建这个builder
         */
        private Builder() {}

        public static Builder getInstance() {
            return new Builder();
        }

        public Builder buildOne(String one) {
            this.one = one;
            return this;
        }
        public Builder buildTwo(String two) {
            this.two = two;
            return this;
        }
        public Builder buildThree(String three) {
            this.three = three;
            return this;
        }
        public Builder buildFour(int four) {
            this.four = four;
            return this;
        }
        public NumberBuild build() {
            return new NumberBuild(this);
        }
    }
}

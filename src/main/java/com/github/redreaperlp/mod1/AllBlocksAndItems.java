package com.github.redreaperlp.mod1;

public enum AllBlocksAndItems {
    RUBY_BLOCK("ruby_block"),
    RUBY("ruby");

    private final String name;

    AllBlocksAndItems(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

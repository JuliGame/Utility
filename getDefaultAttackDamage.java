double getDefaultAttackDamage(Material m){
        switch (m){
            case NETHERITE_AXE:
                return 10;
            case DIAMOND_AXE:
            case IRON_AXE:
            case STONE_AXE:
                return 9;
            case NETHERITE_SWORD:
                return 8;
            case DIAMOND_SWORD:
            case GOLDEN_AXE:
            case WOODEN_AXE:
                return 7;
            case NETHERITE_SHOVEL:
                return 6.5;
            case NETHERITE_PICKAXE:
            case IRON_SWORD:
                return 6;
            case DIAMOND_SHOVEL:
                return 5.5;
            case DIAMOND_PICKAXE:
            case STONE_SWORD:
                return 5;
            case IRON_SHOVEL:
                return 4.5;
            case IRON_PICKAXE:
            case GOLDEN_SWORD:
            case WOODEN_SWORD:
                return 4;
            case STONE_PICKAXE:
                return 3;
            case GOLDEN_SHOVEL:
            case WOODEN_SHOVEL:
                return 2.5;
            case GOLDEN_PICKAXE:
            case WOODEN_PICKAXE:
                return 2;
            case NETHERITE_HOE:
            case DIAMOND_HOE:
            case IRON_HOE:
            case STONE_HOE:
            case GOLDEN_HOE:
            case WOODEN_HOE:
                return 1;
            default:
                return 1;
        }
    }
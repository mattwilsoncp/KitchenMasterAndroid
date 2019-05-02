package com.mattwilsoncp16.recipemaster.content;

import com.mattwilsoncp16.recipemaster.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppActionContent {
    public static final List<AppActionContent.ActionItem> ITEMS = new ArrayList<AppActionContent.ActionItem>();
    public static final Map<String, AppActionContent.ActionItem> ITEM_MAP = new HashMap<String, AppActionContent.ActionItem>();
    private static final int COUNT = 5;

    static {
        addItem(new AppActionContent.ActionItem("1","Recipes", "Test", R.drawable.ic_material_assignment    ));
        addItem(new AppActionContent.ActionItem("2","USDA Data Source", "Test", R.drawable.ic_material_data_source));
        addItem(new AppActionContent.ActionItem("3","Scheduling", "Test", R.drawable.ic_material_schedule));
        addItem(new AppActionContent.ActionItem("4","Grocery Lists", "Test", R.drawable.ic_material_grocery_list));
        addItem(new AppActionContent.ActionItem("5","Inventory", "Test", R.drawable.ic_material_inventory));
    }

    private static void addItem(AppActionContent.ActionItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }
    public static class ActionItem {
        public final String id;
        public final String content;
        public final String details;
        public final int action_icon;

        public ActionItem(String id, String content, String details, int action_icon) {
            this.id = id;
            this.content = content;
            this.details = details;
            this.action_icon = action_icon;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}

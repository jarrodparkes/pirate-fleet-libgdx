package com.udacity.gamedev.piratefleet;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.math.Vector2;

public class Constants {

    public static final Vector2 WORLD_SIZE = new Vector2(16f, 9f);

    public static final int GRID_SIZE = 8;
    public static final Color GRID_CELL_COLOR = Color.WHITE;
    public static final float GRID_CELL_SIZE = WORLD_SIZE.x / 18;

    public static final float HUD_FONT_REFERENCE_SCREEN_WIDTH = 480.0f;

    public static final Color BACKGROUND_COLOR = new Color(0.85f, 0.92f, 1.0f, 1);
    public static final float SETTINGS_WORLD_SIZE = 480.0f;
    public static final float SETTINGS_BUBBLE_RADIUS = SETTINGS_WORLD_SIZE / 8.5f;
    public static final Color SETTINGS_BUBBLE_COLOR = new Color(0.2f, 0.2f, 1, 1);
    public static final float SETTINGS_LABEL_SCALE = 1.5f;

    public static final Vector2 EASY_CENTER = new Vector2(SETTINGS_WORLD_SIZE / 4, SETTINGS_WORLD_SIZE / 2);
    public static final Vector2 MEDIUM_CENTER = new Vector2(SETTINGS_WORLD_SIZE / 2, SETTINGS_WORLD_SIZE / 2);
    public static final Vector2 HARD_CENTER = new Vector2(SETTINGS_WORLD_SIZE * 3 / 4, SETTINGS_WORLD_SIZE / 2);

    public static final String EASY_LABEL = "Easy";
    public static final String MEDIUM_LABEL = "Medium";
    public static final String HARD_LABEL = "Hard";

    public static final boolean SHOW_COMPUTER_OBJECTS = false;

    public static final Color SHIP_COLOR = new Color(0.42f, 0.42f, 0.42f, 1);
    public static final Color MINE_COLOR_1 = new Color(0.42f, 0.42f, 0.42f, 1);
    public static final Color MINE_COLOR_2 = new Color(0.30f, 0.30f, 0.30f, 1);
    public static final Color HIT_COLOR_1 = new Color(0.93f, 0.36f, 0.28f, 0.8f);
    public static final Color HIT_COLOR_2 = new Color(0.95f, 0.50f, 0.35f, 0.9f);
    public static final Color MISS_COLOR_1 = new Color(0.62f, 0.79f, 0.99f, 0.8f);
    public static final Color MISS_COLOR_2 = new Color(0.55f, 0.76f, 1.0f, 0.9f);
    public static final int MINE_LIMIT = 2;

    public enum ShipSize {
        SMALL(2, 1), MEDIUM(3, 2), LARGE(4, 1), XLARGE(5, 1);
        int length;
        int numRequired;

        ShipSize(int length, int numRequired) {
            this.length = length;
            this.numRequired = numRequired;
        }
    }

}

package com.seventh_root.lunasymphonia.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import static com.badlogic.gdx.Gdx.files;
import static com.badlogic.gdx.graphics.GL20.GL_COLOR_BUFFER_BIT;

public class MenuScreen extends ScreenAdapter {

    OrthographicCamera camera;
    SpriteBatch spriteBatch;
    Sprite logoSprite;

    public MenuScreen() {
        camera = new OrthographicCamera();
        camera.setToOrtho(false);
        spriteBatch = new SpriteBatch();
        logoSprite = new Sprite(new Texture(files.internal("logo_darkbg.png")));
        logoSprite.setPosition(0, 600 - logoSprite.getHeight());
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0F, 0F, 0F, 1F);
        Gdx.gl.glClear(GL_COLOR_BUFFER_BIT);
        spriteBatch.setProjectionMatrix(camera.combined);
        spriteBatch.begin();
        logoSprite.draw(spriteBatch);
        spriteBatch.end();
    }
}

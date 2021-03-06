package com.d500px.fivehundredpx.views.grid_screen;

import com.d500px.fivehundredpx.di.component.AppComponent;
import com.d500px.fivehundredpx.di.scope.FragmentScoped;

import dagger.Component;

/**
 * Created by KD on 5/1/16.
 */
@FragmentScoped
@Component(dependencies = AppComponent.class, modules = {
        PhotoGridPresenterModule.class
})
public interface PhotoGridPresenterComponent {

    PhotoGridPresenter getPhotoGridPresenter();
}

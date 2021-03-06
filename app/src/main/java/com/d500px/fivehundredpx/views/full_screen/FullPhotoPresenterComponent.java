package com.d500px.fivehundredpx.views.full_screen;

import com.d500px.fivehundredpx.di.component.AppComponent;
import com.d500px.fivehundredpx.di.scope.FragmentScoped;

import dagger.Component;

/**
 * Created by KD on 5/1/16.
 */
@FragmentScoped
@Component(dependencies = AppComponent.class, modules = {
        FullPhotoPresenterModule.class
})
public interface FullPhotoPresenterComponent {

    FullPhotoPresenter getFullPhotoPresenter();
}

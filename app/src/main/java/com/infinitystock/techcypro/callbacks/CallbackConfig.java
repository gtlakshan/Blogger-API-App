package com.infinitystock.techcypro.callbacks;

import com.infinitystock.techcypro.models.Ads;
import com.infinitystock.techcypro.models.App;
import com.infinitystock.techcypro.models.Blog;
import com.infinitystock.techcypro.models.Category;
import com.infinitystock.techcypro.models.Notification;

import java.util.ArrayList;
import java.util.List;

public class CallbackConfig {

    public Blog blog = null;
    public App app = null;
    public Notification notification = null;
    public Ads ads = null;
    public List<Category> labels = new ArrayList<>();

}

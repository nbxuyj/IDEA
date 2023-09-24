package com.xuyj.demospring.designMode.proxy;

public class MovieStaticProxy implements  Movie {
    Movie movie;

    public MovieStaticProxy(Movie movie) {
        this.movie = movie;
    }

    @Override
    public void play() {
        playStart();
        movie.play();
        playEnd();
    }

    public void playStart() {
        System.out.println("电影开始前正在播放广告");
    }
    public void playEnd() {
        System.out.println("电影结束了，接续播放广告");
    }
}

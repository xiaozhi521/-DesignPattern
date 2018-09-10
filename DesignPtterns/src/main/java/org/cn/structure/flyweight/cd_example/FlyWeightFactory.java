package org.cn.structure.flyweight.cd_example;

import java.util.Hashtable;

/**
 *  享元工厂类
 */
public class FlyWeightFactory {
    private static Hashtable pool = new Hashtable();

    public static Artist getArtist(String name){
        Artist artist = (Artist) pool.get(name);
        if(artist == null){
            artist = new Artist(name);
            pool.put(name,artist);
        }
        return artist;
    }
}

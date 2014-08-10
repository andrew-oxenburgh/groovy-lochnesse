package org.adscale.henry

import groovy.transform.ToString

@ToString(includeNames = true, excludes = 'parent', includePackage = false)
class Campaign {

    String name

    Account parent

    def adverts = [:]

    int maxBid = 1

    def Campaign(Account parent, String name) {
        this.parent = parent
        this.name = name
    }

    void create(String name) {
        def advert = new Advert(this, name)
        adverts.put name, advert
        Create.ads.put name, advert
    }
}

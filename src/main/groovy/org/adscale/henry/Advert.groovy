package org.adscale.henry

import groovy.transform.ToString

@ToString(includeNames = true, excludes = 'parent', includePackage = false)
class Advert {
    String name

    Campaign parent

    Date startDate = new Date(0)

    Date endDate = new Date(Long.MAX_VALUE)

    def Advert(Campaign parent, String name) {
        this.parent = parent
        this.name = name
    }

    boolean getRunning(){
        Create._clock > startDate && Create._clock < endDate
    }
}

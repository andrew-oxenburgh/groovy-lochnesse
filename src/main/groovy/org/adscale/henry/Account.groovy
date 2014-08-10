package org.adscale.henry

import groovy.transform.ToString

@ToString(includeNames = true, excludes = 'parent', includePackage = false)
class Account {

    String name

    def campaigns = [:]

    def Account(String name) {
        this.name = name
    }

    void create(String name) {
        def campaign = new Campaign(this, name)
        campaigns.put name, campaign
        Create.campaigns.put(name, campaign)
    }
}

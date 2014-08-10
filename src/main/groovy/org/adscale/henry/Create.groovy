package org.adscale.henry

class Create {

    static def accounts = [:]

    static def campaigns = [:]

    static def ads = [:]

    static Date _clock = new Date()

    static void create(String name) {
        if (isAccount(name)) {
            accounts.put name, new Account(name)
        }
    }

    def static boolean isAccount(String name) {
        name.startsWith('account') || name.endsWith('account') || name.contains('advertiser') || name.contains('publisher')
    }

    def static boolean isAdvert(String name) {
        !name.startsWith('advertiser') && (name.startsWith('ad') || name.endsWith('ad'))
    }

    def static boolean isCampaign(String name) {
        name.startsWith('campaign') || name.endsWith('campaign')
    }

    static void show(String name) {
        if (name == 'clock') {
            println _clock
        } else if (name == 'all') {
            [accounts, campaigns, ads].each {
                println """=========="""
                it.each {
                    println """
$it
----------"""
                }
            }
        } else if (accounts."$name") {
            println accounts."$name"
        } else if (campaigns."$name") {
            println campaigns."$name"
        } else if (ads."$name") {
            println ads."$name"
        } else {
            println "$name is unknown"
        }
    }

    static def on(String name) {
        if (accounts."$name") {
            return accounts."$name"
        }
        if (campaigns."$name") {
            return campaigns."$name"
        }
        if (ads."$name") {
            return ads."$name"
        }
    }

    static def is(String arg) {
        on(arg)
    }

    static Date clock(def arg) {
        if (arg == 'reset') {
            _clock = new Date()
        } else {
            _clock = arg + _clock
        }
        _clock
    }

    static void check(def args) {

    }
}

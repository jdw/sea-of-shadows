#!/usr/bin/env bash

./gradlew :orb:jvmJar > /dev/null

if [ $? -ne 0 ]; then
    exit $?
fi

VERSION=$(cat gradle.properties | grep "^VERSION" | awk -F "=" '{print $2}')


java -jar orb/output/orb-jvm-$VERSION.jar $@
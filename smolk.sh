#!/usr/bin/env bash

./gradlew :smolk:jvmJar > /dev/null

if [ $? -ne 0 ]; then
    exit $?
fi

VERSION=$(cat gradle.properties | grep "^VERSION" | awk -F "=" '{print $2}')


java -jar smolk/output/smolk-jvm-$VERSION.jar $@
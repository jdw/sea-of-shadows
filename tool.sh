#!/usr/bin/env bash

./gradlew :seaofshadows:jvmJar > /dev/null

if [ $? -ne 0 ]; then
    exit $?
fi

VERSION=$(cat gradle.properties | grep "^VERSION" | awk -F "=" '{print $2}')


java -jar cli/output/seaofshadows-jvm-$VERSION.jar $@
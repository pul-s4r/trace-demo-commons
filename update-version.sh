#!/bin/bash

# Script to update the version in gradle.properties
# Usage: ./update-version.sh <new-version>

if [ $# -eq 0 ]; then
    echo "Usage: $0 <new-version>"
    echo "Example: $0 1.0.0"
    exit 1
fi

NEW_VERSION=$1

# Update gradle.properties
sed -i "s/publish.version=.*/publish.version=$NEW_VERSION/" gradle.properties

# Update build.gradle.kts version
sed -i "s/version = \".*\"/version = \"$NEW_VERSION\"/" build.gradle.kts

echo "Version updated to $NEW_VERSION"
echo "Files updated:"
echo "  - gradle.properties"
echo "  - build.gradle.kts"
echo ""
echo "Don't forget to:"
echo "  1. Commit your changes"
echo "  2. Run: ./gradlew publishToMavenLocal"
echo "  3. Update dependent projects to use the new version"

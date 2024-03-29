#include <vector>
#include <iostream>
#include "Brightness.h"

#define MAX(a, b) a > b ? a : b
#define MIN(a, b) a < b ? a : b

using namespace std;

// a function to limit the value of 'val' from 0 to k
int truncate(int val, int k) {
    if (val >= k) {
        return k;
    }
    else if (val <= 0) {
        return 0;
    }
    else {
        return val;
    }
}

vector<vector<Pixel>> alterImageBrightness(vector<vector<Pixel>> image, float amt) {
    // changing the range of amt from 0 to 200 to 0 to 2
    amt = (amt/100.0);

    // constructing a new image
    vector<vector<Pixel>> newImage;

    for (vector<Pixel> row: image) {
        vector<Pixel> newRow;
        for (Pixel pixel: row) {
            Pixel newPixel;

            int max = MAX(MAX(pixel.r, pixel.g), pixel.b);
            int min = MIN(MIN(pixel.r, pixel.g), pixel.b);

            // // assuming the value of amt ranges from 0 to 2
            // // (this is the portion of the code where the brightness
            // // is changed)
            newPixel.r = truncate(pixel.r*amt, 255);
            newPixel.g = truncate(pixel.g*amt, 255);
            newPixel.b = truncate(pixel.b*amt, 255);

            // adding it into the new image
            newRow.push_back(newPixel);
        }
        newImage.push_back(newRow);
    }

    return newImage;
}

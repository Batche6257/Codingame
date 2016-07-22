while (true) {
    var tallest = 0;
    var tallestH =0;
    for (var i = 0; i < 8; i++) {
        var mountainH = parseInt(readline()); // represents the height of one mountain, from 9 to 0.
        if( mountainH > tallestH){
            tallestH = mountainH;
            tallest = i;
        }
    }
    print(tallest); // The number of the mountain to fire on.
}

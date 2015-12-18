var gulp = require('gulp');
var concat = require('gulp-concat');
var uglify = require('gulp-uglify');

gulp.task('build', function() {
    return gulp.src([
        'assets/lib/jquery/dist/jquery.js',
        'assets/lib/bootstrap/dist/js/bootstrap.js',
        'assets/lib/angular/angular.js',
        'assets/lib/angular-route/angular-route.js',
        'app/app.js',
        'app/**/*Config.js',
        'app/**/*Controller.js',
        'app/**/*Service.js'
    ])
        .pipe(concat('app.js'))
        .pipe(uglify())
        .pipe(gulp.dest('./dist/'));
});

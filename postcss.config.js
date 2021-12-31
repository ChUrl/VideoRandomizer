const cssnano = require('cssnano')

module.exports = {
    plugins: [
        require('postcss-import'),
        require('tailwindcss'),
        require('postcss-nested'),
        require('postcss-sorting'),
        require('postcss-utilities'),
        require('postcss-font-magician'),

        // Only for production:
        process.env.NODE_ENV === 'production' ? require('autoprefixer') : null,
        process.env.NODE_ENV === 'production' ? cssnano({preset: 'default'}) : null
    ]
}

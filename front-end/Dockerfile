FROM nginx
COPY dist /usr/share/nginx/html

RUN rm /etc/nginx/conf.d/default.conf
COPY frontend.conf /etc/nginx/conf.d

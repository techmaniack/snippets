# To prevent Rails from escaping your string,
# apply html_safe method on it
# link::http://stackoverflow.com/questions/4251284/raw-vs-html-safe-vs-h-to-unescape-html

content_tag :h1 do
  [project.desc,
    link_to_image('icon_name', model_name)
  ].join(' ').html_safe
end

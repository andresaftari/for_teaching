import wikipedia
from textblob import TextBlob


def wiki(name="Python (programming language)", length=1):
    """Fetch data from WikiPedia"""

    wiki_sum = wikipedia.summary(name, length)
    return wiki_sum


def search_wiki(name):
    """Search something inside WikiPedia"""

    res = wikipedia.search(name)
    return res


def phrase(name):
    """Convert wiki result text to textblob"""

    page_text = wiki(name)
    blob = TextBlob(page_text)
    return blob.noun_phrases
